

### 데코레이터패턴
##### 컴포넌트 :  기본기능을 뜻하는 

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/excel")
public class ExcelController {

    @PostMapping("/upload")
    public ResponseEntity<List<Person>> uploadExcel(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        try {
            List<Person> personList = parseExcelFile(file);
            return ResponseEntity.ok(personList);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private List<Person> parseExcelFile(MultipartFile file) throws IOException {
        List<Person> personList = new ArrayList<>();

        try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0); // 첫 번째 시트 사용
            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // 헤더는 제외하고 1부터 시작
                Row row = sheet.getRow(i);
                if (row == null) continue;

                Person person = new Person();
                person.setName(getCellValue(row.getCell(0)));
                person.setAddress(getCellValue(row.getCell(1)));
                person.setWorkplace(getCellValue(row.getCell(2)));
                person.setPhoneNumber(getCellValue(row.getCell(3)));
                personList.add(person);
            }
        }

        return personList;
    }

    private String getCellValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((long) cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
4. 테스트 케이스
ExcelControllerTest.java
java
코드 복사
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

import java.io.FileInputStream;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ExcelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUploadExcel() throws Exception {
        MockMultipartFile file = new MockMultipartFile(
                "file",
                "test.xlsx",
                MediaType.MULTIPART_FORM_DATA_VALUE,
                new FileInputStream("src/test/resources/test.xlsx")
        );

        mockMvc.perform(multipart("/api/excel/upload").file(file))
                .andExpect(status().isOk());
    }
}
