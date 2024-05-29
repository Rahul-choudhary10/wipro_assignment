package com.computationalAlgo;
import java.util.*;

class Job{
	char id;
	int deadline;
	int profit;
	
	public Job(char id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
}

public class Assignment3 {
	
	public static void scheduleJobs(Job [] jobs , int n) {
		Arrays.sort(jobs,(a,b) -> b.profit - a.profit);
		
		boolean[] result = new boolean[n];
		char [] jobOrder = new char[n];
		for(int i=0; i<n; i++) {
			result[i] = false;
		}
		
		for(int i=0; i<jobs.length; i++) {
			for(int j=Math.min(n, jobs[i].deadline)-1; j>=0;j--) {
				if(result[j] == false) {
					result[j] = true;
					jobOrder[j] = jobs[i].id;
					break;
				}
			}
		}
		
		System.out.println("Job sequence to maximize profit: ");
		for(int i=0; i<n; i++) {
			if(result[i]) {
				System.out.print(jobOrder[i]+" ");
			}
		}
		
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		Job[] jobs = {
				new Job('a', 2 , 100),
				new Job('b', 1 , 19),
				new Job('c', 2 , 27),
				new Job('d', 1 , 25),
				new Job('e', 3 , 15),
		};
		
		int n = 3;
		scheduleJobs(jobs, n);
	}

}
