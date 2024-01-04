package day1;



/*

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10951 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder builder = new StringBuilder();

		while(true) {
			String x = br.readLine();
			if(x==null || x.length() == 0) {
				break;
			}
			String[] data = x.split(" ");
			int a  = Integer.parseInt(data[0]);
			int b  = Integer.parseInt(data[1]);

			builder.append((a + b)+"\n");
		}

		System.out.println(builder.toString());
	}
}
