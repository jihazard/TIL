package com.testok.www.goorm_level_1.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class ThreeSixNine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);

        IntStream.range(1, Integer.parseInt(input)).filter(s ->
                s%10%3 == 0 && s%10!=0 || s%3==0
        ).forEach(s-> System.out.println(s));


    }
}
