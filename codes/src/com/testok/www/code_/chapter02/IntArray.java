package com.testok.www.code_.chapter02;

public class IntArray {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        int[] a = new int[5];
        a[1] = 30;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length ; i++) {
            System.out.println("a[" + i +"] = " + a[i] );
        }
    }

}
