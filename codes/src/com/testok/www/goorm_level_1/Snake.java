package com.testok.www.goorm_level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);
        Solution(input);
    }

    public static void Solution(String input) {

        String[] inputs= input.split(" ");
        int line = Integer.parseInt(inputs[0]);
        int move = Integer.parseInt(inputs[1]);
        for (int i = 0; i < line ; i++) {
            for (int j = 1; j <= move ; j++) {
                if(i%2==0) {
                    System.out.print("#");
                }
                else {

                    String sharp = (j==move)?"#":".";
                    System.out.print(i+ sharp);

                }
            }

            System.out.println();
        }



    }
}
