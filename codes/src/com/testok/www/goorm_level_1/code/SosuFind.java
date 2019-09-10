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

        System.out.println(solution(10));
    }

    public static int solution(int n) {

        int count = 0;
        for (int i = 2; i <= n ; i++) {
           if(isPrime(i)) count++;
        }

        return count;
    }
    public static boolean isPrime(int n) {
        for (int j = 2; j <= sqrt(n); j++) {
            if(n%j==0)  return false;

        }
        return true;

    }
//    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
//        int candidateRoot = (int) Math.sqrt((double) n);
//        return IntStream.rangeClosed(2,candidateRoot).boxed().filter(x->(x*x)%2==0)
//                .collect(partitioningBy(candidate -> isPrime(candidate)));
//    }
//
//
//    public static boolean isPrime(int candidate) {
//        int candidateRoot = (int) Math.sqrt((double) candidate);
//        return IntStream.rangeClosed(2, candidateRoot).filter(n-> n % 2 ==0)
//                .noneMatch(i -> candidate % i == 0);
//    }



}
