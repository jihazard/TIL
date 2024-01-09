package day3;

/*

문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.


2중 for문 지양하도록 수정

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10809 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int[] result = new int[26];
		for( int i=0; i< 26; i++) {
			result[i] = -1;
		}


		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			//System.out.println("ch : " + (int)ch + " " + (ch - 'a') + " " + (int)'a');
			if(result[ch - 'a'] == -1) {
				result[ch - 'a'] = i;
			}
			//System.out.println((int)alpa + 1);
		}
		StringBuilder builder = new StringBuilder();
		for(int num : result) {
			builder.append(num + " ");
		}
		System.out.println(builder.toString());

	}

	// public static void main(String args[]) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	String alpabet = "abcdefghijklmnopqrstuvwxyz";
	// 	String input = br.readLine();
	// 	int[] result = new int[alpabet.length()];
	// 	for(int i=0; i<alpabet.length(); i++) {
	// 		String alpa = String.valueOf(alpabet.charAt(i));
	// 		for(int j=0; j<input.length(); j++){
	// 			String inputAlpa = String.valueOf(input.charAt(j));
	// 			result[i] = -1;
	// 			if(inputAlpa.equals(alpa)) {
	// 				result[i] = j;
	// 				break;
	// 			}
	// 		}
	// 	}
	//
	//
	// 	for(int i=0; i<result.length; i++) {
	// 		System.out.print(result[i] + " ");
	// 	}
	//
	// }
}

