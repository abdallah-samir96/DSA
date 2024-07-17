package com.dsa.day8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3,1,3,4}, 5)));
    }
   private static int[] twoSum(int[] arr, int target) {
       int []indices = {-1, -1};
       for(int j = 0; j < arr.length; ++j) {
           int search = target - arr[j];




       }
        return indices;
   }
}
