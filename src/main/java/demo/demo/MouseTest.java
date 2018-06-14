package demo.demo;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseTest extends Frame implements MouseListener {
	public Label label;
	MouseTest(){
		addMouseListener(this);
		label=new Label();
		label.setBounds(50,60,100,100);
		add(label);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		// when mouse clicked
		label.setText("Mouse clicked");
		
	}
	public void mouseEntered(MouseEvent e) {
		// when mouse entered 
		label.setText("Moused entered");
		
	}
	public void mouseExited(MouseEvent e) {
		// Mouse exited
		label.setText("Mouse exited");
	}
	public void mousePressed(MouseEvent e) {
		//When mouse pressed
		label.setText("");
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse released");
		
	}
public static void main (String args[]){
	new MouseTest();	
	}

}
