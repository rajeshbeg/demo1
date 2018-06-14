package demo.demo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasTest extends Frame {
	
	CanvasTest() {
		//Make an object 
		Canvas c = new Canvas();
		add(new Mycanvas());
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main (String[]args){
		new CanvasTest();
	}

}
class Mycanvas extends Canvas{
	public Mycanvas(){
		setBackground(Color.gray);
		setSize(300,200);
	}
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillOval(75, 75, 150, 75);
	}
}