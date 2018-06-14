package demo1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt1 implements ActionListener{
	TextField tf;
Awt1(){
	Frame f = new Frame("Calculator");
	tf = new TextField();
	tf.setBounds(40, 50, 190, 30);
	f.add(tf);
	Button b = new Button ("Click me");
	b.setBounds(140,170,70, 30);
	f.add(b);
	b.addActionListener(this);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	tf.setText("Welcome");
	
}
public static void main(String args[]){
	new Awt1();
}
}
