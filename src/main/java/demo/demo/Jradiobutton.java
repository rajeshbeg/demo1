package demo.demo;

import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Jradiobutton extends Frame {
	public Jradiobutton() {
		// add Radio Button 
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Male");
		ButtonGroup bg = new ButtonGroup();
		r1.setBounds(75,50,100,30);    
		r2.setBounds(75,100,100,30);
		bg.add(r1);
		bg.add(r2);
		add(r1);add(r2);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String args[]){
		new Jradiobutton();
	}

}
