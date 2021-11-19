package com.ymplans.leetcode;

import java.util.*;

/**
 * @author Jos
 */
public class Solution1299 {
    public static void main(String[] args) {

    }
    public int[] replaceElements(int[] arr) {
        int partMax = -1;
        int partIndex = -1;

        for(int i = 0; i < arr.length; i++){
            int max = -1;
            for(int j = i + 1; j < arr.length; j++ ){
                if(partMax != -1 && partIndex != -1){
                    if(j < partIndex){
                        max = partMax;
                        break;
                    }
                }
                if(max < arr[j]){
                    max = arr[j];
                    partMax = max;
                    partIndex = j;
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}