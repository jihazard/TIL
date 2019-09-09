package com.testok.www.goorm_level_1.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NXNumber {
    public static void main(String[] args) {

        //solution(2,5);
        solution(-4,2);

    }

    public static long[] solution(int x, int n) {
       /* int value = 0;
        int value2 = 0;
        if(x > 0){
            value = (x * n) + 1;
            value2=x;

        }else{
            value = (x * n) - 1;
            value2= x+1;
        }

        int num1 = x>=0?value2:value;
        int num2 = x<0?value2:value;

        System.out.println(num1 +"/" + num2);
        long[] longs = IntStream.range(num1, num2).filter(t -> t % x == 0).mapToLong(v -> v).toArray();

        System.out.println(longs.toString());

*//*        for (int i = -9; i < -4 ; i++) {
            System.out.println(i);
        }
*//*
*/

        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= n ; i++) {
            System.out.println(i*x);
            list.add(i*x);
        }


        return list.stream().mapToLong(i->i).toArray();
    }
}
