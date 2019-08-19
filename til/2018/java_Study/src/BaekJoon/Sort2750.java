package BaekJoon;

import java.util.Scanner;

public class Sort2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        int[] array= new int [result];

        for (int i = 0; i < array.length ; i++) {
            array[i] = i;
        }

        for (int x: array
             ) {
            System.out.print(x +" ,");
        }
    }
}
