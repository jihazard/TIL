package algo.convert10to2;
//10 진수 2진수로 변환하기
public class Main {
    public static void main(String[] args) {
        int inputNum = 25;

        int[] data = new int[100];

        int value = inputNum;
        int i = 0;
        while(value > 0){
            data[i] = value % 2;
            value /= 2;
            i++;
            
        }

        i--;
        for(;i>=0;i--){
            System.out.print(data[i]);
        }
    }
}
