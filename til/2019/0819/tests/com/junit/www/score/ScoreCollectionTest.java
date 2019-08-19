package com.junit.www.score;

import com.junit.www.score.ScoreCollection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {

    @Test
    public void add() {
        ScoreCollection collection = new ScoreCollection();
        collection.add(()->5);
        collection.add(()->7);

        int actionResult = collection.arithmeticMean();

        assertThat(actionResult , equalTo(6));
    }

    @Test
    public void arithmeticMean() {
    }
}