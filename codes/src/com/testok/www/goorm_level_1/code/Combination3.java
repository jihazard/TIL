package com.testok.www.goorm_level_1.code;

public class Combination3 {
    public static void main(String[] ar){
        Combination3 ex = new Combination3();
        int[] arr = { 2,10,6};
        int n = arr.length;
        int r = 3;
        int[] combArr = new int[n];

        ex.doCombination(combArr, n, r, 0, 0, arr);
    }

    public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
        if(r == 0){
            for(int i=0; i<index; i++) System.out.print(arr[combArr[i]] + " ");
            System.out.println();
        }else if(target == n) return;
        else{
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr); // (i)
            doCombination(combArr, n, r, index, target+1, arr); //(ii)
        }
    }
}