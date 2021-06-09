package com.codility;

public class BinaryGap {
    public int solution(int n) {
        int maxGap = 0;
        n >>= Integer.numberOfTrailingZeros(n) + 1;
        while (n != 0){
            int gap = Integer.numberOfTrailingZeros(n);
            if(maxGap < gap){
                maxGap = gap;
            }
            n >>= gap + 1;
        }
        return maxGap;
    }
}
