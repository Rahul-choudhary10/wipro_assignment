package com.patternSearching.assignment;

import java.util.List;

public class assignment2 {
	private static final int PRIME = 101;

    public static int search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        if (m > n) {
            return -1;
        }

        long patternHash = createHash(pattern, m);
        long textHash = createHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash && checkEqual(text, pattern, i, i + m - 1)) {
                return i;
            }

            if (i < n - m) {
                textHash = recalculateHash(text, i, i + m, textHash, m);
            }
        }

        return -1;
    }

    private static long createHash(String str, int end) {
        long hash = 0;
        for (int i = 0; i < end; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private static long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int patternLen) {
        long newHash = oldHash - str.charAt(oldIndex);
        newHash /= PRIME;
        newHash += str.charAt(newIndex) * Math.pow(PRIME, patternLen - 1);
        return newHash;
    }

    private static boolean checkEqual(String text, String pattern, int start1, int end1) {
        for (int i = 0; i <= end1 - start1; i++) {
            if (text.charAt(start1 + i) != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        int index = search(text, pattern);
        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}

