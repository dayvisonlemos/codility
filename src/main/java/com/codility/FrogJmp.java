package com.codility;

public class FrogJmp {

    public int solution(int x, int y, int d) {
        int space = y - x;
        int increment = 0;
        if(space % d != 0){
            increment = 1;
        }
        return (space/d) + increment;
    }

}
