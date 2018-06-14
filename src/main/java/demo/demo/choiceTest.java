package demo.demo;

import java.awt.Choice;
import java.awt.Frame;

public class choiceTest extends Frame{
	
	choiceTest(){
		Choice c = new Choice();
		c.setBounds(150,100,80,50);
		c.add("java");
		c.add("C++");
		c.add("Python");
		add(c);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main (String[]args){
		new choiceTest();
	}

}
