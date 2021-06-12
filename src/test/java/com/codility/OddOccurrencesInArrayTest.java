package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void shouldReturn7WhenItIsTheOnlyOddNumber() {
        assertEquals(7, this.oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void shouldReturn9876WhenItIsTheOnlyOddNumber() {
        assertEquals(9876, this.oddOccurrencesInArray.solution(new int[]{20, 9876, 23, 20, 23, 9877, 9877}));
    }

}