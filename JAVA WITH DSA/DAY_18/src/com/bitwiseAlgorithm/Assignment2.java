package com.bitwiseAlgorithm;

public class Assignment2 {
	public static void findNonRepeatingElements(int arr[]) {
		int xorResult = 0;
		for(int num:arr) {
			xorResult ^=num;
		}
		
		int rightmostSetBit = xorResult & -xorResult;
		int firstNonRepeating = 0;
		int secondNonRepeating = 0;
		
		for(int num : arr) {
			if((num & rightmostSetBit)==0) {
				firstNonRepeating ^= num;
			}
			else {
				secondNonRepeating ^= num;
			}
		}
		
		System.out.println("Non-repeating elements : "+firstNonRepeating);
	}
	
	public static void main(String args[]) {
		int arr [] = {4,2,4,5,2,3,3,1};
		findNonRepeatingElements(arr);
	}

}
