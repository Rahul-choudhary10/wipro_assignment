package com.heap.assignment;

public class assignment3 {
	private int[] heap;
	private int size;
	private int capacity;
	
	public assignment3(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.heap = new int[capacity+1];
	}
	
	public void insert(int value) {
		if(size == capacity) {
			System.out.println("Heap is full . Cannot insert more elements : ");
			return ;
		}
		
		size++;
		int i = size;
		heap[i] = value;
		
		while(i>1 && heap[parent(i)] > heap[i]) {
			swap(i, parent(i));
			i=parent(i);
		}
	}
	
	public int deleteMin() {
		if(size == 0) {
			System.out.println("Heap is empty. Cannot delete minimum element : ");
			return -1;
		}
		
		int min = heap[1];
		heap[1] = heap[size];
		size--;
		
		minHeapify(1);
		
		return min;
		
		
	}
	
	public int getMin() {
		if(size == 0) {
			System.out.println("Heap is empty. No minimum element.");
			return -1;
		}
		
		return heap[1];
	}
	
	private void minHeapify(int i) {
		int left = leftChild(i);
		int right = rightChild(i);
		int smallest = i;
		
		if(left <= size && heap[left]<heap[i]) {
			smallest = left;
		}
		if(right <= size && heap[right]<heap[smallest]) {
			smallest = right;
		}
		
		if(smallest != i) {
			swap(i, smallest);
			minHeapify(smallest);
		}
	}
	
	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	private int parent(int i) {
		return i/2;
	}
	private int leftChild(int i) {
		return 2*i;
	}
	private int rightChild(int i) {
		return 2*i+1;
	}
	
	public static void main(String args[]) {
		assignment3 minHeap = new assignment3(10);
		minHeap.insert(4);
		minHeap.insert(2);
		minHeap.insert(8);
		minHeap.insert(1);
		
		System.out.println("Minimum element : "+ minHeap.getMin());
		minHeap.deleteMin();
		System.out.println("Minimum element after deletion : "+ minHeap.getMin());
	}
}
