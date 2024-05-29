package com.computationalAlgo;

public class Assignment2 {
	public static int travellingSales(int dist[][]) {
		int n = dist.length;
		int VISITED_ALL = (1 << n)-1;
		int [][] dp = new int[1 << n][n];
		
		for(int i=0; i<(1<<n); i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		dp[1][0] = 0;
		
		for(int mask = 1; mask<(1<<n); mask++) {
			for(int i=0; i<n; i++) {
				
				if((mask & (1<<i))==0) continue;
				
				for(int j=0; j<n; j++) {
					if((mask & (1<<j)) !=0 && i !=j) {
						dp[mask][i] = Math.min(dp[mask][i], dp[mask^(1<<i)][j]+dist[j][i]);
					}
				}
				
			}
		}
		int minCost = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			minCost = Math.min(minCost, dp[VISITED_ALL][i]+dist[i][0]);
		}
		
		return minCost;
	}
	
	public static void main(String args[]) {
		int [][] dist = {
				{0, 10, 15, 20},
				{10, 0, 35, 25},
				{15, 35, 0, 30},
				{20, 25, 30, 0}
		};
		
		System.out.println("The minimum cost is "+ travellingSales(dist) );
	}

}
