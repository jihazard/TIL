package programmers;

public class Lession12922 {
    public static void main(String[] args) {
        System.out.println("n이 3인 경우: " + watermelon(4));

    }

    private static String watermelon(int n) {
        StringBuilder word = new StringBuilder();
        for(int i=1 ; i<=n; i++){
          word.append(String.valueOf(i % 2 == 0 ? '박' : '수'));
        }
        return word.toString();
    }
}
