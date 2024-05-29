package com.patternSearching.assignment;

public class assignment3 {
    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";
        int lastIndex = boyerMooreLastOccurrence(text, pattern);
        System.out.println("The last occurrence of the pattern is at index: " + lastIndex);
    }

    public static int boyerMooreLastOccurrence(String text, String pattern) {
        int[] badChar = preprocessBadCharacterShift(pattern);
        int n = text.length();
        int m = pattern.length();
        int s = 0;

        int lastOccurrenceIndex = -1;

        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j))
                j--;

            if (j < 0) {
                lastOccurrenceIndex = s;
                s += (s + m < n) ? m - badChar[text.charAt(s + m)] : 1;
            } else {
                s += Math.max(1, j - badChar[text.charAt(s + j)]);
            }
        }

        return lastOccurrenceIndex;
    }

    private static int[] preprocessBadCharacterShift(String pattern) {
        final int ALPHABET_SIZE = 256;
        int[] badChar = new int[ALPHABET_SIZE];
        int m = pattern.length();

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            badChar[i] = -1;
        }

        for (int j = 0; j < m; j++) {
            badChar[pattern.charAt(j)] = j;
        }

        return badChar;
    }
}
