package algo._15_gugudan;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------입력원하는 단을 말해주세요");
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= dan; j++) {
                System.out.printf("%3d * %3d = %3d ", j, i , j*i);
            }
            System.out.println();
        }

    }
}
