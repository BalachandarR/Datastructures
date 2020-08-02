package com.ds.stack;

public class StackImpl {

	public static void main(String args[]) {
		System.out.println("Test Main");
		StackPrototype StackPrototype = new StackPrototype(5);
		StackPrototype.push(10);
		StackPrototype.push(50);
		StackPrototype.push(70);
		StackPrototype.push(80);
		StackPrototype.push(40);
		StackPrototype.push(65);
		StackPrototype.push(45);
		
		while(!StackPrototype.isEmpty()) {
			System.out.println(StackPrototype.pop());
		}
		
		
	}
	

}
