package com.bitwiseAlgorithm;

public class Assignment1 {
	public static int countSetBits(int num) {
		int count = 0;
		while(num>0) {
			count += num & 1;
			num >>= 1;
		}
		return count;
	}
	
	public static int countTotalSetBits(int n) {
		int totalSetBits = 0;
		for(int i=1; i<=n; i++) {
			totalSetBits += countSetBits(i);
		}
		return totalSetBits;
	}
	
	public static void main(String args[]) {
		int num = 23;
		System.out.println("Number of set bits "+num+": "+countSetBits(num));
		
		int n = 10;
		System.out.println("Total number of set bits from 1 to "+n+" : " + countTotalSetBits(n));
	}

}
