package com.dsa.day5.checkAnagram;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {


        System.out.println(checkAnagram("aca", "abb"));
        System.out.println("************************");
        System.out.println(isAnagram("abc", "bba"));
        System.out.println("************************");
        System.out.println(isAnagram("aca", "abb"));

    }
    /*
    * this wa not works in all cases aca, abb will be anagram but this is not right
    *
    * */
    private static boolean checkAnagram(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }
        long firstCodes = first.codePointAt(0);
        long secondCodes = second.codePointAt(0);
        System.out.println("First Codes : " + firstCodes + ", Second Codes: " + secondCodes);
        for(int i = 1; i < first.length(); ++i) {
            firstCodes += first.codePointAt(i);
            secondCodes += second.codePointAt(i);
        }
        return firstCodes == secondCodes;
    }
    /**
     * Another solution
     * to be anagram, the array should only contain zero's values
     * All String should be in uppercase, lowercase
     * */
    private static boolean isAnagram(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }
        // all characters is 26
        int[] balance = new int[26];
        for(int i = 0; i < first.length(); ++i) {
            // here we just increase the 0 value or decrease it
            balance[first.charAt(i) % 26]++;
            balance[second.charAt(i) % 26]--;
        }
        System.out.println(Arrays.toString(balance));
        // here if it's anagram, the array should only have the zero's values
        for (int i : balance) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
