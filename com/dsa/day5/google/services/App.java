package com.dsa.day5.google.services;
import java.util.*;
public class App {
    public static void main(String[] args) {
        int []scores = new int[] {500, 900, 300, 200, 100, 1000, 1000};
        System.out.println(Arrays.toString(scores));
        List<String> marks = getMedals(scores);
        System.out.println(marks);

    }
    private static List<String> getMedals(int[] scores) {
        Map<Integer, Integer> marks = new HashMap<>();
        List<String> medals = new ArrayList<>();
        int scoresLength = scores.length;
        List<Integer> oldScores = new ArrayList<>();
        for(int score: scores) oldScores.add(score);
        Arrays.sort(scores);
        for(int i = 0; i < scoresLength; ++i) { marks.put(scores[i], scoresLength - i); }
        oldScores.forEach((score) -> medals.add(getMark(marks.get(score))));
        return medals;
    }
    /**
     * Get the Mark based on the Score
     * */
    private static String getMark(int mark) {
        switch (mark) {
            case 1: return "Gold";
            case 2: return "Silver";
            case 3: return "Bronze";
            default: return String.valueOf(mark);
        }
    }
}
