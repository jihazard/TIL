package com.testok.www.code_.chapter01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Multi99table {
    public static void main(String[] args) {
        ex3();
/*        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++)
                if(i==0){
                    System.out.printf("%3d", 1 * j);
                }else if(j==0){
                    System.out.printf("%3d", i * 1);
                }else {
                    System.out.printf("%3d", i + j);
                }

           System.out.println();
        }*/
    }

    public static void ex1 (){
        int no = input();

        for (int i = 1; i <= no ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void ex2(){
        int no = input();
        for (int i = 1; i < no ; i++) {
            for (int j = 1; j < no - i ; j++) {
                System.out.print("-");
            }
            for (int x = 1; x < i * 2 + 1; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void ex3() {
        int no = input();

        for (int i = no; i >= 1; i--) {
            IntStream.rangeClosed(1,i).forEach(p-> System.out.print("*"));
            System.out.println();
        }

    }


    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===> 단 ");
        int no = sc.nextInt();
        return no;
    }
}
