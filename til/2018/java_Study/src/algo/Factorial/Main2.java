package algo.Factorial;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("--------팩토리얼을 수행할 숫자를 입력해주세요 ");
        int input = sc.nextInt();

        int sum=1;
        for (int i = 1; i <= input ; i++) {
            sum *= i;
            System.out.println(i+"//"+sum);
        }
        System.out.println(" 팩토리얼 값으 :" + input +"/// 결과는 : " + sum);

    }
}
