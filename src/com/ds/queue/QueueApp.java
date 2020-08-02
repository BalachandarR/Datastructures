package com.ds.queue;

public class QueueApp {
	
	public static void main(String ar[]) {
		QueueImpl q = new QueueImpl(5);
		q.insert(10);
		q.insert(3);
		q.insert(4);
		q.insert(65);
		q.insert(44);
		q.insert(65);
		q.insert(44);
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
