package com.dsa.day5.checkAnagram;

public class App {
    public static void main(String[] args) {
        System.out.println(checkAnagram("abd", "cba"));
    }
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
}
