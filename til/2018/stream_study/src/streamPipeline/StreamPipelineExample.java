package streamPipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("윤지환" , Member.MALE , 35)
                ,new Member("김나라" ,  Member.FEMALE, 20)
                ,new Member("김득현" ,  Member.MALE, 45)
        );

        double doustream = list.stream()
                .filter(n -> n.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("평균"  + doustream);
    }
}
