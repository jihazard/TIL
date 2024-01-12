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
		int count2 = 2 * count - 1;
		for (int i = 0; i < count2; i++) {
			String empty = " ".repeat(count2);
			int center = count2 / 2;
			for (int j = 0; j < empty.toCharArray().length; j++) {

					empty = empty.substring(0, j) + "*" + empty.substring(j+1);

			}

			for(char ch : empty.toCharArray()) {
				System.out.print(ch);
			}
			System.out.println("");
			//System.out.println("center : " + center);
			//empty.charAt( count2 / 2);

			//1 3 5 7 9
		}

	}
}

