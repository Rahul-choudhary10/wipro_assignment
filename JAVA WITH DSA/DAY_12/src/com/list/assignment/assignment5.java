package com.list.assignment;

public class assignment5 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		
		while(current != null && current.next != null) {
			if(current.val == current.next.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		
		return head;
	}
	
	public void printList(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		assignment5 remover = new assignment5();
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(4);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(4);
		
		System.out.println("Original list : ");
		remover.printList(head);
		ListNode newList = remover.deleteDuplicates(head);
		
		System.out.println("List after removing duplicates : ");
		remover.printList(newList);
	}
}


