package com.dsa.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(null instanceof String);
            int sum = 9;
            var result = get2Sums(new int[]{1, 2, 3, 5}, sum);
            System.out.println(Arrays.toString(result));
        }

        System.out.println(getFirstNonRepeatableCharacter("aaaL"));

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

    private static char getFirstNonRepeatableCharacter(String plain) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < plain.length(); ++i) {
            map.merge(plain.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i < plain.length(); ++i) {
            if(map.get(plain.charAt(i)) == 1){
                return plain.charAt(i);
            }
        }
        throw new RuntimeException("Not Found Exception!!!!");
    }
}