package demo.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
public static void main (String args[]){
	ArrayList<String> Student= new ArrayList<String>();// make a aarray list
	// add details in this list
	Student.add("Rajesh");
	Student.add("Rahman");
	Student.add("Nishan");
	Student.add("Queen");
	
	
	// How to Traverse the dta 
//	Iterator itr = Student.iterator();
//	while(itr.hasNext()){
//		System.out.println(itr.next());
//}
		for (String name: Student){
			System.out.println(name);
		}
		
		
	
}
}
