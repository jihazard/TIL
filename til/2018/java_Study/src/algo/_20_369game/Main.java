package algo._20_369game;

public class Main {
    public static void main(String[] args) {
        int data = 100;

        for (int i = 0; i < data; i++) {
            int cnt = getNum(i);
            if(cnt==0) System.out.print(i +" ");
            else{
                for (int j = 0; j <cnt ; j++) {
                    System.out.print("짞 ");
                }
            }
        }


    }

    private static int getNum(int i) {

     int j = 0;
     while( i > 0 ) {
         if(i % 10==3 || i % 10==6 || i % 10==9 )
            j++;
         i/=10;
     }
     return j;
    }
}
