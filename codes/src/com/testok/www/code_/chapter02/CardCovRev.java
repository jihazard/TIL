package com.testok.www.code_.chapter02;

import java.util.Scanner;

//진수 변환 프로그램
public class CardCovRev {
    public static void main(String[] args) {
        char[] x = null;
        System.out.println(rev(500,8));
    }
    public static int rev(int x , int r){
        //int input = returnInput();
        int digis = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] d = new char[dchar.length()];
        do{
            System.out.println(d[digis]);
            d[digis++] = dchar.charAt(x % r);

            x /=r;
        }while(x!=0);
        return digis;
    }
    public static int returnInput() {
        System.out.println("==== 입력 ==> :");
        return new Scanner(System.in).nextInt();
    }

}
