package algo.QuickSort;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] data ={10,9,6,7,1,2,3,8};
        quickSort(data,0,data.length-1);
        for (int x: data
             ) {
            System.out.print(x);
        }
    }

    private static void quickSort(int[] data, int left, int right) {

        int pivot = data[(left+right)/2];
        int start = left;
        int end = right;
        System.out.println("피벗값 : " + pivot );
        do{
            while(data[start] < pivot) start ++;
            while(data[end] > pivot) end--;
            System.out.println("레프트 : " + left +"//" + right);
            System.out.println("스타트 : " + left +"//" + right);

            if(start<=end){
                int temp = data[start];
                data[start] = data[end];
                data[end] = temp;

                start++;
                end--;
            }

        }while(start<=end);


            if(start<right) quickSort(data,start,right);
            if(end >left) quickSort(data,left,end);


        }
        }
