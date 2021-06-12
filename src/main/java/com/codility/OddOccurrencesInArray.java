package com.codility;

public class OddOccurrencesInArray {

    public int solution(int[] a) {
        int oddNumber = 0;
        for(int i =0; i<a.length; i++){
            oddNumber ^= a[i];
        }
        return oddNumber;
    }
}
