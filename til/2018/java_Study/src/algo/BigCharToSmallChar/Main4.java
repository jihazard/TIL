package algo.BigCharToSmallChar;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------대소문자 변경할 문자를 입력하세요");
        String input = sc.nextLine();

        char[] data = new char[input.length()];
        data = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if(data[i] >= 'a' && data[i] <='z'){
                data[i] = (char)(data[i] + 'A'-'a');
            }else  if(data[i] >= 'A' && data[i] <='Z'){
                data[i] = (char)(data[i] - ('A'-'a'));
            }
        }

        for (char x: data
             ) {
            System.out.print(x);
        }
    }
}
