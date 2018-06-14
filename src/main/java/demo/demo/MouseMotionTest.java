package demo.demo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionTest extends Frame implements MouseMotionListener {
	public Label label;
	MouseMotionTest(){
		label = new Label();
		label.setBounds(40,50,100,50);
		add(label);
		addMouseMotionListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	
public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(Color.GREEN);
		g.fillOval(e.getX(), e.getY(),10,10);
	}

	public void mouseMoved(MouseEvent e) {
		//set dimension
		label.setText("++X "+e.getX()+", ++Y "+e.getY());
	}
public static void main(String args[]){
	new MouseMotionTest();	
	}
}
