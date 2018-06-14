package demo.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListExample extends Frame {
	ListExample(){
		final Label label = new Label();
		label.setAlignment(Label.CENTER);
	    label.setSize(400,100);
	    add(label);
		final List l = new List(3,false);
		l.setBounds(100,100, 70,70);
		add(l);
		l.add("India");
		l.add("America");
		l.add("France");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
		Button b = new Button("Show");
		b.setBounds(150,200,50,30);
		add(b);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String data= "Selected country is: "+l.getItem(l.getSelectedIndex());
				label.setText(data);
			}
		});
		//Set Label
		
	}

	public static void main (String[]args){
		new ListExample();
	}

}
