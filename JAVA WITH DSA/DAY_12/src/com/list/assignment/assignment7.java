package com.list.assignment;

public class assignment7 {
	
	public static ListNode mergeLists(ListNode head1, ListNode head2) {
		if(head1==null) return head2;
		if(head2==null) return head1;
		
		ListNode mergedHead = (head1.val <head2.val)? head1 :head2;
		
		ListNode current1 = head1;
		ListNode current2 = head2;
		ListNode prev = null;
		
		while(current1 != null && current2 !=null) {
			if(current1.val<current2.val) {
				prev = current1;
				current1 = current1.next;
			}
			else {
				ListNode temp = current2.next;
				if(prev!=null) {
					prev.next = current2;
				}
				current2.next = current1;
				prev = current2;
				current2 = temp;
			}
		}
		if(current2 != null) {
			prev.next = current2;
		}
		return mergedHead;
	}
	
	public static void printList(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.val+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);
		
		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(4);
		head2.next.next = new ListNode(6);
		
		System.out.println("List 1");
		printList(head1);
		
		System.out.println("List 2");
		printList(head2);
		
		ListNode mergedList = mergeLists(head1, head2);
		System.out.println("Merged List:");
		printList(mergedList);
	}

}
