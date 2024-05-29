package com.stack.assignment;

import java.util.Stack;

public class assignment4 {
	public static void sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek()>temp) {
				stack.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}
	
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(8);
		stack.push(1);
		
		sortStack(stack);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
