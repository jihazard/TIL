package com.testok.www.goorm_level_1.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Minsu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);
        String[] value = input.split(" ");
        IntStream.range(Integer.parseInt(value[0]),Integer.parseInt(value[1])).filter(x->Integer.parseInt(value[1]) % x == 0).forEach(s-> System.out.println(s));

    }
}
