package java_list_05;
//3차원 배열의 순차 표현
public class Ex5_3 {
    public static void main(String[] args) {
        int sale[][][] = new int [][][]{{{11, 12, 13, 14}
                , {21, 22, 23, 24}}
                , {{31, 32, 33, 34}
                , {41, 42, 43, 44}}};

        for (int i = 0; i <2 ; i++) {
            System.out.printf("<< %d 팀 >> %n", i+1);
            for (int j = 0; j < 2 ; j++) {
                for (int k = 0; k < 4 ; k++)
                    System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d  %n", k+1,i,j,k,sale[i][j][k]);

                    System.out.println("---------------------------------------");
                }
                System.out.println();

        }
        }

}
