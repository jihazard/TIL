package doitAlgo.chapter1.al01_02;

import java.util.Scanner;

public class MakeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(n);
        System.out.println("---------------");
        piramid(n);

        System.out.println("---------------");
        unpiramid(n);


    }

    private static void unpiramid(int n) {
        System.out.println("unpiramid");
        for (int i = n; i > 0 ; i--) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print("j"+j);
            }
            for (int k = i*2+1; k > 0; k--) {
                System.out.print("k:" +k);
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void piramid(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle(int n) {
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
