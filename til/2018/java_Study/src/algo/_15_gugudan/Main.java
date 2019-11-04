package algo._15_gugudan;
//구구단1
public class Main {
    public static void main(String[] args) {
        int s = 2;
        int f = 5;

        for (int i = 1; i <= 9; i++) {
            for (int j = s; j < f; j++) {
                System.out.printf("%3d *%3d =%3d  " , j,i, i*j );
            }
            System.out.println();
        }
    }
}
