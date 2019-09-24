package com.testok.www.code_.chapter02;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        max();
    }

    public static void ex1() {
        int[] a= {1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void max() {
        // 요소가 3개면  if문이 2개 필요  4개면 3개
        int max= 0;
        int[] a= {5,2,3,2,5,6,7,8,0};

        max = a[0];

//        if(a[1] > max) max = a[1];
//        if(a[2] > max) max = a[2];

        for (int i = 0; i < a.length ; i++) {
            if(a[i] > max) max= a[i];
        }

        System.out.println("최대값 ==>" + max);

    }

    public static void reverse() {

    }
}
