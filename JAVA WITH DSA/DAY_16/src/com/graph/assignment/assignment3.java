package com.graph.assignment;
public class assignment3 {

    public static void searchPattern(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int comparisons = 0;

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                comparisons++;
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == patternLength) {
                System.out.println("Pattern found at index " + i);
            }
        }

        System.out.println("Total comparisons made: " + comparisons);
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        searchPattern(text, pattern);
    }
}
