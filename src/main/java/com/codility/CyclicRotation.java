package com.codility;

public class CyclicRotation {

    public int[] solution(int[] a, int k) {
        int[] b = new int[a.length];
        int i = 0;
        while (i < a.length) {
            b[(k + i) % a.length] = a[i++];
        }
        return b;
    }
}