package algo.manyTimeValue;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,1,2,2,3,3,4,4,4};

        int[] mode =new int[data.length];

        for (int i = 0; i <data.length; i++) {
            mode[data[i]]++;
        }


        int max = 0;
        int modeCnt=0;

        for (int i = 0; i < mode.length; i++) {
            if(modeCnt < mode[i]){
                modeCnt = mode[i];
                max=i;
            }
        }
        System.out.println("최대값 : " + max +"/////" + modeCnt);

    }
}
