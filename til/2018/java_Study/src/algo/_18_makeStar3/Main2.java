package algo._18_makeStar3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------입력하세요");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if(i<j) System.out.print(" ");
                else  System.out.print("*");
            }
            System.out.println();
        }
    }
}
