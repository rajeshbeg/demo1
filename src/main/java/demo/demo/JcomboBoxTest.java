package demo.demo;

import java.awt.Frame;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

public class JcomboBoxTest {
	
	JcomboBoxTest(){
		Frame f = new Frame ("ComboBox Example");
		String countries[]={"India","USA","UK"};
		JComboBox cb = new JComboBox(countries);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main (String[]args){
		new JcomboBoxTest();
	}
}
