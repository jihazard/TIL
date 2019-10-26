package Dp.C9_OPSERVER.score_compl;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scoress = new ArrayList<>();

    public void addScore(int score){
        scoress.add(score);

        notifyObservers();
    }

    public List<Integer> getScore() {
        return scoress;
    }
}
