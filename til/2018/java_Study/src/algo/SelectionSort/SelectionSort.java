package algo.SelectionSort;
/*선택정렬*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] value = {10,9,8,7,6,5,4,3,2,1} ;
        System.out.println(arr(value));
    }

    public static int[] arr(int[] demoArray){
        int min , temp ,  index = 0;
        for (int i = 0; i < demoArray.length ; i++) {
            min = 9999;

            for (int j = i; j < demoArray.length; j++) {
                if(min > demoArray[j]) {
                    min = demoArray[j];
                    index = j;
                }
            }
            temp = demoArray[i];
            demoArray[i] = demoArray[index];
            demoArray[index] = temp;
        }



        for (int x : demoArray) System.out.print(x +" , ");
        return demoArray;
    }
}
