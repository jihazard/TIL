package java_list_05;

//분기별 판매량 리스트 프로그램
public class Ex5_1 {
    public static void main(String[] args) {

        int sale[] = new int[]{157,209,251,312};

        for (int i = 0; i < sale.length ; i++) {
            System.out.printf("%d/4분기 : sale[%d] = %d  %n",
                    i+1,i,sale[i]);
        }
    }
}
