package demo.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main (String[]args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sam");
		list.add("Ram");
		list.add("Rikta");
		list.remove("Ram");
		Iterator itr= list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				
	}

}
