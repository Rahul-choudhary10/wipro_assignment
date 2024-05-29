package com.stack.assignment;

import java.util.Stack;

public class assignment6 {
	public static boolean isSequencePresent(Stack<Integer> stack, int[] sequence) {
		int sequenceIndex = 0;
		while(!stack.isEmpty()&& sequenceIndex<sequence.length) {
			if(stack.peek()==sequence[sequenceIndex]) {
				stack.pop();
				sequenceIndex++;
			}
			else {
				break;
			}
		}
		return sequenceIndex ==sequence.length;
	}
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		int[] sequence1 = {1,2,3,4,5};
		int [] sequence2 = {1,3,5};
		
		System.out.println("Sequence 1 present : "+ isSequencePresent(stack, sequence1));
		System.out.println("Sequence 2 present : "+ isSequencePresent(stack, sequence2));
		
		}
}
