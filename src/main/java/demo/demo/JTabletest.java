package demo.demo;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTabletest  {
	public Frame f;
	public JTabletest() {  
		    f=new JFrame();    
		    String data[][]={ {"101","Amit","670000"},    
		                          {"102","Jai","780000"},    
		                          {"101","Sachin","700000"}};    
		    String column[]={"ID","NAME","SALARY"};         
		    final JTable jt=new JTable(data,column);    
		    jt.setBounds(30,40,200,300);
		    // Add List SelectionListener
		    
		    jt.setCellSelectionEnabled(true);
		    ListSelectionModel select = jt.getSelectionModel();
		    select.addListSelectionListener(new ListSelectionListener() {
				
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
					String data=null;
					int row[]=jt.getSelectedRows();
					int column[]=jt.getSelectedColumns();
					for (int i=0;i<=row.length;i++){
						for (int j=0;j<=column.length;j++){
							data= (String) jt.getValueAt(i,j);
						}
					}
					System.out.println("Table element selected data : "+data);
				}
			});
		    
		    JScrollPane sp=new JScrollPane(jt);    
		    f.add(sp);          
		    f.setSize(300,400);    
		    f.setVisible(true);

	}
	public static void main (String[]args){
		new JTabletest();
	}

}
