package algo.BigCharToSmallChar;

public class Main3 {
    public static void main(String[] args) {
        String name = "HelloWorldDD";

        char[] data = new char[name.length()];
        data = name.toCharArray();
        for (int i = 0; i < data.length ; i++) {
            if(data[i] >= 'a' && data[i] <= 'z') {
                data[i] = (char)(data[i] + 'A' -'a');
            }else if(data[i] >= 'A' && data[i] <= 'Z') {
                data[i] = (char)(data[i] - ('A' -'a'));
            }


        }
        for (char x: data
        ) {
            System.out.print(x);
        }
    }
}
