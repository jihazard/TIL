package com.testok.www.goorm_level_1.code;

import java.util.Arrays;
import java.util.stream.Stream;

public class BasicCode {
    public static void main(String[] args) {
        System.out.println( solution("a234"));
    }

    public static boolean solution(String s) {
        if((s.length()==4 ||  s.length()==6 )){
            System.out.println("==== 실행?");
            return s.matches("-?\\d+(\\.\\d+)?");
        }
        return false;
    }
}
