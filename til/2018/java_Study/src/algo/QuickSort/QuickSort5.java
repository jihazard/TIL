package algo.QuickSort;

public class QuickSort5 {
    public static void main(String[] args) {
        int[] data = {5,6,1,3,2,9,10,7,4};
        quickSortxx(data,0,data.length-1);

        for (int x : data){
            System.out.print(x+",");
        }
    }

    private static void quickSortxx(int[] data, int start, int end) {

        int left = start;
        int right = end;
        int pivot = data[(start+end)/2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;

            if(left<=right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while(left<=right);
        if(start < right) quickSortxx(data,start,right);
        if(end > left) quickSortxx(data,left,end);
    }
}
