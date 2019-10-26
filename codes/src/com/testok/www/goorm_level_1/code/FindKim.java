package com.testok.www.goorm_level_1.code;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindKim {
    public static void main(String[] args) {
        String[] list = {"Jane", "Jane2", "Jane3", "Kim"};
        System.out.println(solution(list));
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int kim = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 1에 있다".replace("1",String.valueOf(kim));
    }
}
