package com.patternSearching.assignment;

public class assignment1 {
	public static int[] computePSArray(String pattern) {
		int [] lps = new int[pattern.length()];
		int len = 0;
		int i= 1;
		lps[0] = 0;
		
		while(i<pattern.length()) {
			if(pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len!=0) {
					len = lps[len-1];
				}
				else {
					lps[i] = 0;
					i++;
				}
			}
		}
		
		return lps;
	}
	
	public static void KMPSearch(String text, String pattern) {
		int lps [] = computePSArray(pattern);
		int textLength = text.length();
		int patternLength = pattern.length();
		int i = 0;
		int j = 0;
		
		while(i<textLength) {
			if(pattern.charAt(j) == text.charAt(i)) {
				i++;
				j++;
			}
			if(j == patternLength) {
				System.out.println("Pattern found at index "+(i-j));
				j = lps[j-1];
			}
			else if(i<textLength && pattern.charAt(j) != text.charAt(i)) {
				if(j!=0) {
					j = lps[j-1];
				}
				else {
					i++;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";
		KMPSearch(text, pattern);
	}

}
