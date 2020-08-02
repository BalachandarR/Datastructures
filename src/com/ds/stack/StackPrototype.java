package com.ds.stack;

public class StackPrototype {

	
	int[] stackArray;
	int top=-1;
	int stackSize =0;
	
	
	public StackPrototype(int stackSize) {
		this.stackArray = new int[stackSize];
		this.stackSize = stackSize;
	}
	
	void push(int item) {
		if(!isFull()) {
			top ++;
			this.stackArray[top]=item;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	int pop() {
		int itemCurrent = this.stackArray[top];
		this.top--;			
		return itemCurrent;
	}
	
	int peak() {
		return  this.stackArray[top];
	}
	
	boolean isFull() {
		return this.top == this.stackSize-1;
	}
	
	boolean isEmpty() {
		return this.top ==-1;
	}

}
