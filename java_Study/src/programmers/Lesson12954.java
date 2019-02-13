package programmers;
/*
 x만큼 간격이 있는 n개의 숫자

문제 설명

함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
제한 조건

    x는 -10000000 이상, 10000000 이하인 정수입니다.
    n은 1000 이하인 자연수입니다.

입출력 예
x 	n 	answer
2 	5 	[2,4,6,8,10]
4 	3 	[4,8,12]
-4 	2 	[-4, -8]

*/
public class Lesson12954 {
    public static void main(String[] args) {
        System.out.println(solution(-4,2));
    }

    private static long[] solution(int x, int n) {
        long[] resul = new long[n];
        int num = 0;
        boolean flag = false;
        if (x < 0)  {
            x *= (-1);
            flag = true;
        }
        System.out.println("flag : " + flag);
            for (int i = x; i <= x * n; i += x) {
                int kk =  flag==false?i:i*(-1);
                System.out.println("kk : " + kk);
                resul[num] = kk;
                num++;
                System.out.println(i);
            }

        return null;
    }
}
