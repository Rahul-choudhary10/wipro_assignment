package com.list.assignment;


public class assignment2 {
	public int findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow.val;
	}
	
	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		assignment2 ass2 = new assignment2();
		int middle = ass2.findMiddle(head);
		System.out.println("Middle element : "+middle);
		
		}

}
