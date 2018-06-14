package demo.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextfielldExample implements ActionListener {

	TextField tf1,tf2,tf3;
	Button b1,b2;
	TextfielldExample(){
		Frame f = new Frame ("Calculator");
		tf1= new TextField();
		tf1.setBounds(40, 50, 80, 30);
		tf2= new TextField();
		tf2.setBounds(40,100, 80, 30);
		tf3= new TextField();
		tf3.setBounds(40, 150, 80, 30);
		f.add(tf1);f.add(tf2);f.add(tf3);
		tf3.setEditable(false);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		// Add Button 
		 b1 = new Button ("+");
		 b2=new Button ("-");
		b1.setBounds(40,200,30,20);
		b2.setBounds(70,200,30,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		// add button into framework
		f.add(b1);
		f.add(b2);
		
	}
	public void actionPerformed(ActionEvent e) {
		// get the string from tf1
		String s1= tf1.getText();
		String s2=tf2.getText();
		//Parse into integer 
		int a= Integer.parseInt(s1);
		int b= Integer.parseInt(s2);
		int c =0;
		if (e.getSource()==b1){
			c=a+b;			
		}else if(e.getSource()==b2){
			c=a-b;
		}
		// show result 
		String result = String.valueOf(c);
		tf3.setText(result);
	}
	public static void main (String[]args){
	new TextfielldExample();	
	}
}
