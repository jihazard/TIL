package day4;

/*

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2444 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int center = 2 * count - 1;
		StringBuilder builder = new StringBuilder();
		for( int i = 0; i < center; i++) {
			if(i < count) {
				for(int j = 0; j < center; j++) {
					if(j < count - i - 1 || j > count + i - 1) {
						//System.out.println("j < count - i - 1: " + (j  +" " + (count - i - 1)) + " j > count + i - 1 : " + (j +" "+ (count + i - 1)));
						builder.append(" ");
						//System.out.print(" ");
					} else {
						builder.append("*");
						//System.out.print("*");
					}
				}
			}else {
				for(int j = 0; j < center; j++) {

					if(j < i - count + 1 || j > center - i + count - 2) {
						//System.out.println("j < i - count + 1 : " + (j  + " " + (i - count + 1)) + " j > center - i + count - 2 : " + (j +" " + (center - i + count - 2)));
						builder.append(" ");
						//System.out.print(" ");
					} else {
						builder.append("*");
						//System.out.print("*");
					}
				}
			}

			//System.out.println("");
			builder.append("\n");
		}

		System.out.println(builder.toString());
	}
}

