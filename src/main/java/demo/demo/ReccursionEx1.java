package demo.demo;
public class ReccursionEx1 {
	static int count=0;
	static void p(){
		count++;
		if (count<=5){
	System.out.println("Hello");
	p();
	}
	}
	public static void main(String args[]){
		p();
	}
}
