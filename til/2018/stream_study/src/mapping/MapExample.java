package mapping;

import streamToCollection.Student;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동" ,10)
                ,new Student("윤지환" , 20)
                ,new Student("김득현", 30)
        );

        list.stream().mapToInt(Student::getScore).forEach(s-> System.out.println(s));

    }
}
