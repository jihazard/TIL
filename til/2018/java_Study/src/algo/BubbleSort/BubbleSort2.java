package algo.BubbleSort;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] data = {2,1,10,9,7,3,4,3,8,6,5};

        bubbleSort(data);
    }

    private static void bubbleSort(int[]   data) {
        int temp;

        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j < (data.length-1) -i ; j++) {
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for(int x : data) System.out.print(x +"/");
    }
}
