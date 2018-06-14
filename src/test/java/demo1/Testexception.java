package demo1;

import java.io.IOException;

class Parent{
	void msg(){
		System.out.println("Parents");
	}
}
class testChild extends Parent{
	void msg()throws ArithmeticException{
		System.out.println("child");
	}
}
public class Testexception {
	public static void main(String[]args){
		
		testChild c = new testChild();
		c.msg();
	}

}
