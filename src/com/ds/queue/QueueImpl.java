package com.ds.queue;

public class QueueImpl {

	int front;
	int rear;
	int[] queue;
	int qSize;
	int nItems;

	public QueueImpl(int size) {
		qSize = size;
		queue = new int[size];
		front = 0;
		rear = -1;
		nItems =0;
	}

	void insert(int item) {
		if (!isFull()) {
			rear++;
			queue[rear] = item;
			nItems++;
		}
		else {
				rear = -1;
				rear++;
				queue[rear] = item;
				nItems++;
			
		}
	}

	int remove() {
		int item = queue[front];
		front++;
		nItems--;
		
		if(front == qSize){
			front = 0; // we can set front back to the 0th index so that we can utilize the entire array again
		}
		return item;
	}

	int view() {
		return queue[front];
	}

	boolean isFull() {
		return nItems == qSize;
	}

	boolean isEmpty() {
		return nItems ==0;
	}

}
