package com.ll.level2.p12949;

public class Main {
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr1[i].length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return arr;
    }
}