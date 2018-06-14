package demo.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new LinkedList();
		queue.add(2);
		queue.add(3);
		queue.add(5);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);

	}

}
