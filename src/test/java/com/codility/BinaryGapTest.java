package com.codility;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void shouldReturn2forBinaryGapOf9() {
        assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void shouldReturn4forBinaryGapOf529() {
        assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void shouldReturn1forBinaryGapOf20() {
        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void shouldReturn0forBinaryGapOf15() {
        assertEquals(0, binaryGap.solution(15));
    }

    @Test
    public void shouldReturn0forBinaryGapOf32() {
        assertEquals(0, binaryGap.solution(32));
    }

}