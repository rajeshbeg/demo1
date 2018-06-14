package demo.demo;

import java.util.LinkedList;

public class LinklistTest {
	public static void main (String[]args){
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(6);
		System.out.println(list.peek());
		list.addFirst(1);
		list.add(2, 8);
		System.out.println(list);
		
		
		
	}

}
