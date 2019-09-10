package com.testok.www.goorm_level_1.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.lang.StrictMath.sqrt;
import static java.util.stream.Collectors.partitioningBy;

public class SosuFind {
    public static void main(String[] args) {
        //System.out.println(solution(100));

        System.out.println(solution(5));
        int n=5;
        long count = IntStream.range(2, n+1).filter(t -> isPrime(t)).count();
        System.out.println("count => " +count);
    }

    public static int solution(int n) {

        int count = 0;
        for (int i = 2; i <= n ; i++) {
           if(isPrime(i)) count++;
        }

        return count;
    }
    public static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if(n%j==0)  return false;

        }
        return true;

    }



}
