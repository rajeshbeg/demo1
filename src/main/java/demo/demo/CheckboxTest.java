package demo.demo;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxTest extends Frame{
   Checkbox ch1,ch2;
	CheckboxTest(){
		final Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		ch1= new Checkbox("c++");
		add(ch1);
		ch1.setBounds(100, 100, 50, 50);
		ch2= new Checkbox("java");
		ch2.setBounds(100, 150, 50, 50);
		add(ch2);
		add(label);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		
		ch1.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
			 label.setText("c++ checkbox : "+(e.getStateChange()==1?"checked":"Unchecked"));
			}
		});
		ch2.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("jave checkbox: "+(e.getStateChange()==1?"checked ":"Unchecked "));
			}
		});
	
		}
	
	
	public static void main(String[]args){
	new CheckboxTest();
	}
	
}
