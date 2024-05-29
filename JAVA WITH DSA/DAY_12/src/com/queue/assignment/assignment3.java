package com.queue.assignment;
//import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class assignment3 {
	public static void sortQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!queue.isEmpty() && queue.peek()<temp) {
				stack.push(queue.poll());
			}
			queue.add(temp);
		}
	}
		
		
		public static void main(String args[]) {
			Queue<Integer> queue = new LinkedList<>();
			queue.add(5);
			queue.add(1);
			queue.add(4);
			queue.add(8);
			
			sortQueue(queue);
			while(!queue.isEmpty()) {
				System.out.print(queue.poll() +" ");
				
			}
		}
}
