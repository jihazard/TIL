package algo.example;
//소수판별
public class Main2 {
    public static void main(String[] args) {
        int num=13;
        //소수 1과 자시자신을 제외하고 나누어 떨어지는 약수가 있으면 소수가 아님

        boolean isNumber = true;

        for (int i = 0; i < num/2; i++) {
            if(num %2 ==0) isNumber = false;
        }

        if(isNumber) System.out.println(num +"는 소수입니다.");
        else System.out.println(num +"는 소수가 아닙니다.");
    }


}
