package demo.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea1 extends Frame implements ActionListener{
	Button b1;
	Label l1,l2;
	TextArea ta;
	TextArea1(){
		//Set text Area
		ta = new TextArea();
		ta.setBounds(40, 200, 100, 100);
		add(ta);
		// Set label 
		l1 = new Label();
		l1.setBounds(50,50,100,30);
		add(l1);
		
		l2= new Label();
		l2.setBounds(160,50,100,30);
		add(l2);
		Button  b = new Button ("Count");
		b.setBounds(140,300,70,20);
		add(b);
		// Add listner
		b.addActionListener(this);
		
		// Add frame 
		setSize(400,450);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main (String args[]){
		new TextArea1();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// count the word and text
		
		  String text=ta.getText(); 
		  System.out.println(text);
		    String words[]=text.split("\\s");  
		    l1.setText("Words:" +words.length);  
		    l2.setText("Charac:"+text.length()); 
	}

}
