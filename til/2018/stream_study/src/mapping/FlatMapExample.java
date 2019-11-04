package mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("java 9", "lam da" ,"stream Mapping");
        inputList.stream()
                .flatMap(data-> Arrays.stream(data.split(" ")))
                .forEach(s-> System.out.println(s));

        System.out.println("------------------------------------------------");

        List<String> inputlist2 = Arrays.asList("10, 20 , 30", "40, 50, 60");
        inputlist2.stream().flatMapToInt(data->{
            String[] strarr = data.split(",");
            int[] intarr = new int[strarr.length];
            for (int i = 0; i < intarr.length ; i++) {
                intarr[i] = Integer.parseInt(strarr[i].trim());
            }
            return Arrays.stream(intarr);
        }).forEach(n-> System.out.println(n));
    }
}
