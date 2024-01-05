package day2;

/*

문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

배열을 입력받고 v를 찾는 문제

입력방식을 변경하여 해결


* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Back10807 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int[] arr = new int[s];
        String str = br.readLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int findNumber = Integer.parseInt(br.readLine());
        int sameCount = 0;
        for(int number : arr){
           if(number == findNumber){
               sameCount++;
           }
        }
        System.out.println(sameCount);
    }
}

