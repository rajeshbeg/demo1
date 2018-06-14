package demo.demo;

import java.util.LinkedList;

public class ListTest {
public static void main (String args[]){
	LinkedList<String> list = new LinkedList<String>();
	list.add("Salim");
	list.add("Salena");
	list.add("Adil");
	list.addFirst("Mahamad");
	
	for(String x: list){
		System.out.println(x);
	}
}
}
