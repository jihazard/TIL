package algo.sumOfDigit;
//자리수 더하기
public class Main {
    public static void main(String[] args) {

        int input =1234;
        int sum = 0;


        while(input > 0 ){
            sum += input % 10;
            System.out.println(sum +"//" + input);
            input /=10;
        }
        System.out.println(sum);
    }
}
