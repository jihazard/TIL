package com.testok.www.goorm_level_1.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameNumberHate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr1) {
        int[] arr = new int[]  {4, 4, 4, 3, 3};
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        /*int preNum = 10;
        for(int num : arr) {
            if(preNum != num) tempList.add(num);

            preNum = num;
        }
*/


        //list.stream().forEach(System.out::println);

        Integer[] integers = tempList.toArray(new Integer[tempList.size()]);
        return tempList.stream().mapToInt(i -> i).toArray();

 /*       int[] answer = new int[tempList.size()];
    for(int i=0; i<answer.length;i++){
        answer[i] = tempList.get(i).intValue();
    }
*/

    }
}
