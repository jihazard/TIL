package algo.QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int number = 10;
        int[] value={10,9,6,7,1,2,3,8};
        for (int x : value
        ) {
            System.out.print(x + ",");
        }

        quickSort(value,0, value.length-1);
        for (int x : value
             ) {
            System.out.print(x + ",");
        }
    }

    public static void quickSort(int[] data , int left , int right){

        int pivot = data[(left+ right)/2];
        System.out.println("----피벗값 : " + pivot);
        do {
            while (data[left] > pivot) left++;
            while (data[right] < pivot) right--;
            System.out.println("레프트 : " + left +"///// 라이트 : " + right);

            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;

                left++;
                right--;

            }
        }while (left <= right) ;

            if (left < right) quickSort(data, left, right);
            if (right > left) quickSort(data, left, right);
        }


}
