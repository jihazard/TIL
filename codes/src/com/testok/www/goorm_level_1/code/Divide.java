package com.testok.www.goorm_level_1.code;

import java.util.Arrays;
import java.util.Optional;

/*문제 설명
https://programmers.co.kr/learn/courses/30/lessons/12910

        array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
        제한사항

        arr은 자연수를 담은 배열입니다.
        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
        divisor는 자연수입니다.
        array는 길이 1 이상인 배열입니다.

        입출력 예
        arr 	divisor 	return
        [5, 9, 7, 10] 	5 	[5, 10]
        [2, 36, 1, 3] 	1 	[1, 2, 3, 36]
        [3,2,6] 	10 	[-1]
        입출력 예 설명*/
public class Divide {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        System.out.println(Arrays.toString(solution(arr, 5)));

    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%divisor==0) count ++;
        }
        answer= new int[count];
        int answerCount =0;
        for (int i = 0; i <  arr.length ; i++) {
            if(arr[i]%divisor==0) {
                answer[answerCount++] = arr[i];
            }
        }

        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }

         return answer;
    }
    public static int[] solutionToStream(int[] arr, int divisor) {
        int[] answer = {};
        int[] ints = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if(ints.length==0){
            ints= new int[1];
            ints[0] = -1;
        }

        return ints;
    }
}
