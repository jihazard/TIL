package algo.BubbleSort;
/*버블 정렬
* 옆에 있는 값과 비교해서 더 작은 값을 아으로 보내면 어떨까?
* 구현은 쉬우나 효율은 가장 비효율적
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] value = {10, 9,8,7,6,5,4,3,2,1} ;
        System.out.println(arr(value));
    }

    public static int[] arr(int[] demoArray){
        int temp;

        for (int i = 0; i < demoArray.length; i++) {
            for (int j = 0; j < 9-i; j++) {
                if(demoArray[j] > demoArray[j+1]){
                    temp = demoArray[j];
                    demoArray[j] = demoArray[j+1];
                    demoArray[j+1] = temp;
                }
            }
        }


        for (int x : demoArray) System.out.print(x +" , ");
        return demoArray;
    }
}
