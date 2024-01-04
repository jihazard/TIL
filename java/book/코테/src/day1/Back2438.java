package day1;



/*

문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2438 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder builder = new StringBuilder();
		long s = Long.parseLong(br.readLine());

		for (int i = 1; i <= s; i++) {
			builder.append("*".repeat(i)+"\n");

		}
		System.out.println(builder.toString());
	}
}
