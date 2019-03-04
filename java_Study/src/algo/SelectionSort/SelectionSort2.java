package algo.SelectionSort;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] data = {2,1,10,9,7,3,4,3,8,6,5};

        selectionSort(data);
    }

    private static void selectionSort(int[] data) {
        int temp,min,index = 0;

        for (int i = 0; i < data.length; i++) {
            min=99999999;
            for (int j = i; j < data.length ; j++) {
                if(min > data[j]) {
                    min = data[j];
                    index = j;
                }
            }

            temp = data[i];
            data[i]= data[index];
            data[index] = temp;

        }

        for(int x : data) System.out.print(x+",");
    }
}
