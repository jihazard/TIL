package com.testok.www.goorm_level_1.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class FindMinValue {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String g= br.readLine();


        //        String input = br.readLine();
//        System.out.println("Hello Goorm! Your input is " + input);
//
        String input ="3\n-1 -2 -3 -4 -5 1 2 3 4 5";
        String[] value = input.split("\n");
        int min = Arrays.stream(value[1].split(" ")).mapToInt(s->Integer.parseInt(s)).min().orElse(0);

        System.out.println(min);
    }
}
