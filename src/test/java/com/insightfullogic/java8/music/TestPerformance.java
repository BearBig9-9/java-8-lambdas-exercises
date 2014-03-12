package com.insightfullogic.java8.music;

import org.junit.Test;

import java.util.*;

import static com.insightfullogic.java8.music.SampleData.johnLennon;
import static com.insightfullogic.java8.music.SampleData.theBeatles;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static junit.framework.Assert.assertEquals;

public class TestPerformance {

    @Test
    public void allMembers() {
        Album album = new Album("foo", Collections.<Track>emptyList(), singletonList(theBeatles));
        Set<Artist> musicians = album.getAllMusicians().collect(toSet());
        Set<Artist> expectedMusicians = new HashSet<>(SampleData.membersOfTheBeatles);
        expectedMusicians.add(theBeatles);
        assertEquals(expectedMusicians, musicians);
    }

}
