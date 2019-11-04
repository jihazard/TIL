package com.testok.www.goorm_level_1.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Birdaeiou {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int num =  Integer.parseInt(number);
        String[] value = new String[num];
        for (int i = 0; i < num; i++) {
            value[i] = br.readLine();
        }


        String s1;
        String aei= "/[aeiou]/i";
        Pattern ae = Pattern.compile("([aeiou])");
        for (int i = 0; i < value.length; i++) {

            Stream<Character> characterStream = value[i].codePoints().mapToObj(c -> (char) c);
            s1 = characterStream.filter(s -> (s == 'a' || s == 'e' || s == 'u' || s == 'i' || s == 'o') ||
                    (s == 'A' || s == 'E' || s == 'U' || s == 'I' || s == 'O'))
                    .map(item -> String.valueOf(item.toString()))
                    .reduce((a, b) -> a + b)
                    .orElse("???");


            System.out.println(s1);

        }
    }
}
