package com.testok.www.goorm_level_1.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Prices {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int budget = 10;
        solution(arr, budget);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
     /* IntStream sorted = Arrays.stream(d).sorted();
        sorted.forEach(System.out::println);
      */

        Arrays.sort(d);
        int sum  = 0;
        for (int i = 1; i < d.length ; i++) {
            sum += d[i];
            System.out.println(sum +"////" +  d[i]);
            if((sum + d[i+1])> budget) {
                answer=i+1;
                break;
            }

        }

        return answer;
    }
}
