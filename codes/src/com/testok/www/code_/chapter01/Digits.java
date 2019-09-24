package com.testok.www.code_.chapter01;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("입력하시오 : = >");
        try {

            do {
                System.out.println("입력 : => " );
              no = sc.nextInt();

            }while(no < 10 || no > 99);
            System.out.println("변수 no 의 값 ==> " + no);

        }catch (Exception e){
            System.out.println(e.getMessage() + "예외발생");
        }


    }
}
