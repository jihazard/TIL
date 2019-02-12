package Dp.C9_OPSERVER.score_compl;


import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }



    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(record,null);
        int max = Collections.max(record,null);
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }

    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScore();
        displayMinMax(record);
    }
}
