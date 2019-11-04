package algo.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int[] data = new int[100];

        data[1]=1;
        data[2]=1;

        for (int i = 3; i < data.length ; i++) {
            data[i] = data[i-1] + data[i-2];
        }


        for (int x :data){
            System.out.print(x+",");
        }
    }
}
