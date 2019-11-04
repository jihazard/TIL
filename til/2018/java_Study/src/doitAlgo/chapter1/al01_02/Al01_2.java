package doitAlgo.chapter1.al01_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Al01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------N1--------------");

        int n = sc.nextInt();
        System.out.println("-----------------N2--------------");

        int n2 = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum += i;
        }

        int i =1;
        int sum2=0;
        while (i<=n){
            sum2 += i;
            i++;
        }

        System.out.println("합 : " + sum);
        System.out.println("합 : " + sum2);
        System.out.println(n +" 에서 부터 " + n2 +"까지의 합은 : " + sumOf(n,n2));
    }

    private static int sumOf(int n, int n2) {
        int sum = 0;
        for (int i= n ; i<= n2; i++){
            sum += i;
            System.out.println(i+"//"+sum);
        }
        return sum;
    }

    private static int gaus(int i) {
        return (1+ i) * 5;
    }
}
