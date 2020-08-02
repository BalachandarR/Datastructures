package com.ds.stack;

public class StackReverseStringImpl {
	
	char[] charArray;
	int top;
	int stackSize = 0;
	
	public StackReverseStringImpl(int stackSize) {
		this.charArray = new char[stackSize];
		this.stackSize = stackSize;
		this.top =-1;
	}

	void push(char item) {
		this.top ++;
		this.charArray[top]=item;
	}
	
	char pop() {
		char item = this.charArray[top];
		this.top --;
		return item;
	}
	
	char peak() {
		return  this.charArray[top];
	}
	
	boolean isFull()
	{
		return this.stackSize-1==this.top;
	}
	
	boolean isEmpty() {
		return this.top == -1;
	}
}
