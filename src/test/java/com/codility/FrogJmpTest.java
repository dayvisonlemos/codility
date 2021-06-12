package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void shouldReturn3ForNumberOfJumps(){
        assertEquals(3, this.frogJmp.solution(10, 85, 30));
    }

    @Test
    public void shouldReturn1ForNumberOfJumps(){
        assertEquals(1, this.frogJmp.solution(10, 85, 75));
    }

}