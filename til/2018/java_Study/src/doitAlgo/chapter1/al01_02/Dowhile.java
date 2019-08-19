package doitAlgo.chapter1.al01_02;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------곱셈표");
        int n=sc.nextInt();
        System.out.println("----n2");
        int n2=sc.nextInt();

        multi(n,n2,"*");
        System.out.println("==========================");
        multi(n,n2,"+");


    }


    public static void multi(int n ,int n2,String option){

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n2;j++) {

                int temp = result(i,j,option);
                int length = (int)(Math.log10(temp)+1);
                if(length==1) System.out.print(result(i,j,option) + "   ");
                if(length==2) System.out.print(result(i,j,option) + "  ");

            }

            System.out.println();

        }

    }

    private static int result(int i, int j,String option) {
        if(option.equals("*")) return i*j;
        else if(option.equals("+")) return i+j;
        return 0;
    }
}
