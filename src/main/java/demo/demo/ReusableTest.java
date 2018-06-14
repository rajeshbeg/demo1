package demo.demo;

import com.thoughtworks.selenium.webdriven.commands.GetAllWindowTitles;

public class ReusableTest {
	private int i;
	
	public int setI(int i){
		return this.i=i;
		
	}
	public int getI(){
		return i;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ReusableTest rt= new ReusableTest();
		rt.setI(5);
		System.out.println(getI());
		
	}

}
