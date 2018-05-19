package streamToCollection;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*컬렉션으로 스트림 얻기
 * */
public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("윤지환", 30),
                new Student("김득현", 34),
                new Student("백승규", 32)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.printf("%s 의 점수는 %d 입니다.\n", s.getName() ,s.getScore() ));
    }
}
