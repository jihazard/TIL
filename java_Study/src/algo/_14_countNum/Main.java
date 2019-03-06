package algo._14_countNum;
//숫자 개수 출력하기

public class Main {
    public static void main(String[] args) {
        int n = 1234567122;

        int[] arr = new int [10];

        while(n > 0){
            arr[n%10] ++;
            n /= 10;

        }

        for (int x : arr) System.out.print(x +",");
    }
}
