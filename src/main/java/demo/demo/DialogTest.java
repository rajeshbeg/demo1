package demo.demo;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
	public static Dialog d;
	public DialogTest() {
		final Frame f= new Frame();
		d= new Dialog(f,"Dialog Exapmle",true);
		d.setLayout(new FlowLayout());
		Button b= new Button ("OK");
		b.setBounds(150,100,40,30);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				DialogTest.d.setVisible(true);  
			}
		});
		d.add(new Label("click on ok button to continue"));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}
	public static void main (String args[]){
		new DialogTest();
	}

}
