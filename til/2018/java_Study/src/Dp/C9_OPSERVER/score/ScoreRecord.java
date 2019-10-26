package Dp.C9_OPSERVER.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores =new ArrayList<>();
    //private DataSheetView dataSheetView;
    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MinMaxView minMaxView;

    public void addDataSheetView(DataSheetView dataSheetView){
        dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView){
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) {
        scores.add(score);
        for(DataSheetView dataSheetView: dataSheetViews){
            dataSheetView.update();
            minMaxView.update();
        }

    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;


    }

    public MinMaxView getMinMaxView() {
        return minMaxView;
    }
}


