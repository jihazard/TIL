package doitAlgo.chapter1.al01_01;

import java.util.Scanner;

public class C01_1 {
    /*
    * 세 값의 최대값
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------최대값을 구하라");
        System.out.println("-----a값 입력");
        int num1 = sc.nextInt();
        System.out.println("-----b값 입력");
        int num2 = sc.nextInt();
        System.out.println("-----c값 입력");
        int num3 = sc.nextInt();

        int max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;

        System.out.println("최대값 : " + max);

    }
}
