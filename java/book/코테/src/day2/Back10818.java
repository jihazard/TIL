package day2;

/*

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.


min과 max를 0으로 시작하여 오류가 발생함



* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


       int str = Integer.parseInt(br.readLine());
       String str1 = br.readLine();
         String[] strArr1 = str1.split(" ");

       int min = Integer.valueOf(strArr1[0]);
       int max = Integer.valueOf(strArr1[0]);


       for(int i = 0; i < str; i++){
           int temp = Integer.valueOf(strArr1[i]);
           if(temp > max){
               max = temp;
           }
            if(temp < min){
                min = temp;
            }

       }
       System.out.println(min + " " + max);
    }
}

