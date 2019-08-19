package streamToCollection;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*배열로 부터 스트림 얻기*/
public class FromArrayExample {
    public static void main(String[] args) {
        String[] array = {"윤지환","김득현","백승배"};
        Stream<String> streamArray = Arrays.stream(array);

        streamArray.forEach(s -> System.out.println(s));

        int[] intArray ={1,2,3,4,5,6,7};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.println(a));
    }
}
