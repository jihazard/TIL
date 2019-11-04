package algo.QuickSort;

public class QuickSort3 {
    public static void main(String[] args) {
        int[] data = {7,1,3,6,5,4,9,0,2,-100};
        quickSort(data,0,data.length-1);

        for (int x: data
             ) {
            System.out.print(x +",");

        }
    }

    private static void quickSort(int[] data, int start, int end) {

        int left = start;
        int right = end;

        int pivot = data[(start+end)/2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;

            if(left<=right){
                int temp = data[left];
                data[left]= data[right];
                data[right] = temp;

                left++;
                right--;
            }

        }while(left<=right);

        if(start < right) quickSort(data,start,right);
        if(end > left) quickSort(data,left,end);

    }
}
