package day4;

/*

문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1316 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = Integer.parseInt(str);
		int minusCount = 0;
		for (int i = 0; i < count; i++) {
			boolean[] arr = new boolean[26];
			System.out.println(count + "   " + minusCount);
			String input = br.readLine();
			System.out.println(input.charAt(0)  + " : " + (int)input.charAt(0)  + " : " + (char)97 + " : " + ((int)input.charAt(0) - 97));
			//j가 1부터 시작하기 때문에 0을 true로 초기화 해놔야 오류가 발생하지 않는다.
			arr[(int)input.charAt(0) - 'a'] = true;
			for (int j = 1; j < input.length(); j++) {
				char current = input.charAt(j);
				// System.out.println(" c : " + current +"( " + (int)current +" )"   + " : " + input.charAt(j - 1) +"  " + (int)input.charAt(j - 1));
				// 현재 문자와 이전 문자가 같으면 다음 문자로 넘어간다.
				if (current == input.charAt(j - 1))
					continue;

				if (arr[(int )current - 'a']) {
					minusCount++;
					break;
				}
				//그룹문자가 아닌 경우 true로 바꿔준다.
				arr[(int)current - 'a'] = true;
			}

		}

		System.out.println(count - minusCount);
	}
}

