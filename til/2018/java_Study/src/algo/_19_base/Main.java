package algo._19_base;
//거듭제곱
public class Main {
    public static void main(String[] args) {
        int n=5;
        int m=7;
        int res = 1;

        for (int i = 0; i < m ; i++) {
            res *= n;
        }
        System.out.println(res);
    }
}
