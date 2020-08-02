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

		while (!StackPrototype.isEmpty()) {
			System.out.println(StackPrototype.pop());
		}

		String inputString = "Balachandar Rangasamy";
		StackReverseStringImpl stringReverse = new StackReverseStringImpl(inputString.length());

		for (char c : inputString.toCharArray()) {
			stringReverse.push(c);
		}

		while (!stringReverse.isEmpty()) {
			System.out.print(stringReverse.pop());
		}
	}

}
