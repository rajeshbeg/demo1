package demo.demo;

import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
	PopupMenuTest(){
	final Frame  f= new Frame ("Pop up menu Example");
	//   Set Frame Size 
	     f.setSize(400, 400);
	     f.setLayout(null);
	     f.setVisible(true);
	     // set Label 
	     final Label label= new Label();
	     label.setAlignment(Label.CENTER);
	     label.setSize(300,100);
	     f.add(label);
	     //Set Menu Item
	     final PopupMenu popupmenu = new PopupMenu("Edit");
	     MenuItem i1= new MenuItem("Cut");
	     i1.setActionCommand("cut");
	     popupmenu.add(i1);
	     MenuItem i2= new MenuItem("Copy");
	     i2.setActionCommand("copy");
	     popupmenu.add(i2);
	     MenuItem i3= new MenuItem("paste");
	     i3.setActionCommand("Paste");
	     popupmenu.add(i3);
	     f.addMouseListener(new MouseAdapter() {
	    	 public void mouseClicked(MouseEvent e){
	    		 // pop menu
	    	 popupmenu.show(f, e.getX(),e.getY());
	    		 
	    	 }
		});
	     f.add(popupmenu);
	     
	     
	     
	}
public static void main (String args[]){
	new PopupMenuTest();
}
}
