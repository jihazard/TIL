package algo._10_numRec;
//숫자 직각사각형 만들기1
//if n =3
/*
*   123
*   456
*   789
* */
public class Main {
    public static void main(String[] args) {

        int input = 5;
        int num= 1;
        for (int i = 1; i < input; i++) {
            //System.out.print(i);
            for (int j = 1; j < input; j++) {
                System.out.printf("%4d",num);
                num++;
            }
            System.out.println();
        }
    }
}
