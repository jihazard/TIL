package day2;

/*

문제
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.

도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.

공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 공을 교환한다.

출력
1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

문제 분석이 어려웠음

1.배열을 이용하여 풀이
2. i와 j값의 배열을 변경하라는게 핵심임
3. i와 j값을 받아서 i-1과 j-1의 값을 변경하면 됨

입력
5 4
1 2
3 4
1 4
2 2

출력
3 1 4 2 5

풀이
5
1 2 3 4 5 라는 배열이 존재한다.
4 줄의 i j 값이 존재한다.

1 2   1번배열과 2번 배열의 값을 변경한다.
3 4   3번배열과 4번 배열의 값을 변경한다.
1 4   1번배열과 4번 배열의 값을 변경한다.
2 2   2번배열과 2번 배열의 값을 변경한다.

 1 2 3 4 5
[1,2,3,4,5]
[2,1,3,4,5]
[2,1,4,3,5]
[4,1,2,3,5]
[4,2,1,3,5

* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10813 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split(" ");
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        int[] arr = new int[n + 1];
        for(int i=0; i< n; i++){
            arr[i] = i +1;
        }

        for(int j=0; j< m ; j++) {
            String temp = br.readLine();
            String[] tempArr = temp.split(" ");
            int iNum = Integer.parseInt(tempArr[0]);
            int jNum = Integer.parseInt(tempArr[1]);
            int tmp = arr[iNum-1];
            arr[iNum-1] = arr[jNum-1];
            arr[jNum-1] = tmp;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

