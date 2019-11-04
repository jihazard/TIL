package algo.BigCharToSmallChar;

//대문자 소문자로 변환하기
//소문자는 대문자로 변환하기
public class Main2 {
    public static void main(String[] args) {
        String input = "helloworlD";

        char[] convert;
        convert = input.toCharArray();
        System.out.println(input);
        for (int i = 0; i < convert.length; i++) {
            if(convert[i]>='a' &&  convert[i]<='z'){
                convert[i] = (char)(convert[i] + 'A' - 'a');
            }else if(convert[i]>='A' &&  convert[i]<='Z'){
                convert[i] = (char)(convert[i] - ('A' - 'a'));
            }


        }

        System.out.println(convert);
    }
}
