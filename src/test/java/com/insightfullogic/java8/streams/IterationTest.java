package com.insightfullogic.java8.streams;

import com.insightfullogic.java8.music.SampleData;
import org.junit.Test;

public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.internalCountArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }
}
