package com.testok.www.code_.chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class CloneArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 ==>");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num ; i++) {
            System.out.println("x[" + i +"] :" );
            x[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(x));
        reverse(x);

        System.out.println("=====역순정렬");
        System.out.println(Arrays.toString(x));
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

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length/2 ; i++) {
            System.out.println(i +"//" +(a.length-i-1));
            swap(a,i,a.length-i-1);
        }
    }

    public static void swap(int[] a, int idx1,int idx2){
        int t= a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
