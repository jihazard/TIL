package algo._10_numRec;

import java.util.Scanner;

//숫자 직각사각형 만들기1
//if n =3
/*
 *   123
 *   456
 *   789
 * */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------사각형을 만들 숫자를 입력하세요 : ");

        int input = sc.nextInt();
        int n =1;

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%4d",n);
                n++;
            }
            System.out.println();
        }
    }
}
