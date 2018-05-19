package streamToCollection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//파일 내용을 소스로 하는 스트림
public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c:/temp/linedata2.txt");
        Stream<String> stream;

        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach( System.out :: println);
        System.out.println();

        File file = path.toFile();
        FileReader fileReader =  new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        stream = br.lines();
        stream.forEach(System.out :: println);
    }
}
