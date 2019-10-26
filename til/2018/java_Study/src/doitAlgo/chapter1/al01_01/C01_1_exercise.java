package doitAlgo.chapter1.al01_01;

import java.util.Scanner;

public class C01_1_exercise {
    /*
    * 세 값의 최대값
    *
    * */

    public static void main(String[] args) {
       max4(5,2,3,4);
       min3(5,2,3);

    }

    private static void min3(int i, int i1, int i2) {
        int min = i;
        if(i1 < min) min= i1;
        if(i2 < min) min = i2;

        System.out.println(min);
    }

    private static void max4(int i, int i1, int i2, int i3) {
        int max = i;
        if(i1>max) max = i1;
        if(i2>max) max = i2;
        if(i3>max) max = i3;

        System.out.println(max);
    }
}
