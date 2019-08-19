package filterling;

import java.util.Arrays;
import java.util.List;
//중복제거
public class FilteringExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("홍길동" , "신용권" ,"김자바","윤지환", "윤지환","홍길동");
        name.stream().distinct().forEach(s-> System.out.println(s));

        System.out.println("-------------------------------------");
        name.stream().filter(n-> n.startsWith("홍")).forEach(s-> System.out.println(s));
        System.out.println("-------------------------------------");
        name.stream().distinct().filter(n->n.startsWith("윤")).forEach(s-> System.out.println(s));

    }
}
