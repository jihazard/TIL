package com.testok.www.goorm_level_1.code;

import java.util.stream.IntStream;

public class Yaksu {
    public static void main(String[] args) {
        System.out.println(solution2Stream(12));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0) answer += i;
        }
        return answer;
    }
    public static int solution2Stream(int n) {

        return IntStream.rangeClosed(1, n).filter(num -> n % num == 0).sum();
    }
}
