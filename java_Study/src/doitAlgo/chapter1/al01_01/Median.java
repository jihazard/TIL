package doitAlgo.chapter1.al01_01;

public class Median {
    public static void main(String[] args) {
        int med = med3(1, 2, 3);
        System.out.println(med);
    }

    private static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= b)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;

    }

}
