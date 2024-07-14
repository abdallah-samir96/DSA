package com.dsa.day7;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        System.out.println(null instanceof String);
        int sum = 9;
        var result = get2Sums(new int[]{1,2,3,5}, sum);
        System.out.println(Arrays.toString(result));
    }

    /**
     * The array is sorted
     * */
    private static int[] get2Sums(int [] data, int sum) {

        int [] indexes = {-1, -1};
        int head = 0;
        int tail = data.length - 1;
        for(int j = 0 ; j < (data.length / 2) + 1; j++) {
            if(sum > data[head] + data[tail]) {
                head ++;
            }else if(sum < data[head] + data[tail]) {
                tail --;
            }else{
                indexes[0] = head;
                indexes[1] = tail;
            }
        }
        return indexes;
    }

}