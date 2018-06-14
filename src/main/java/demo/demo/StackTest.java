package demo.demo;

import java.util.Stack;

class StackTest {
	public static void main (String []args){
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		System.out.println(stack.peek());
		stack.push("Samu");
		System.out.println(stack);
		stack.pop();
		stack.pop();
		System.out.println(stack);
	}

}
