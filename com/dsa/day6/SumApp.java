package com.dsa.day6;

import java.util.Arrays;

public class SumApp {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sumAccumulative(arr)));
    }
    /**
     * Accumulate each number to the previous elements
    * */
    public static int[] sumAccumulative(int [] arr) {
        int sum = 0;
        int[] sumAccumulative = new int[arr.length];
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            sumAccumulative[i] = sum;
        }
        return sumAccumulative;
    }
}
