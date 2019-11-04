package Dp.C9_OPSERVER.score;

import java.util.List;

public class DataSheetView {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update(){
        List<Integer> record = scoreRecord.getScores();
        displayScore(record,viewCount);
    }

    private void displayScore(List<Integer> record, int viewCount) {
        System.out.println("lists of " + viewCount);
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
