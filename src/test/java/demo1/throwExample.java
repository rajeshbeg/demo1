package demo1;

public class throwExample {
	static void validate(int age){
	if (age<18){
		throw new ArithmeticException("not valid"); 
	}else {
		System.out.println("Allow for the vote");
	}
	
	}
	public static void main(String args[]){
		validate(25);
		System.out.println("rest of the code...");  
	}

}
