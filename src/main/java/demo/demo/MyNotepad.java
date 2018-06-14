package demo.demo;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;


class Fileoperation {
	Notepad npd;
	boolean saved;
	boolean newFileflag;
	String fileName;
	String ApllicateionTitle="Universal NotePad";
	File fileRef;
	JFileChooser chooser;

	boolean isSaved(){
		return saved;
	}
	void setsaved(boolean Saved){
		this.saved=saved;
	}
	String getFilename(){
		return new String (fileName);

	}
	String setFilename(String fileName){
		return (this.fileName=fileName);
	}
	Fileoperation(Notepad npd) {
		this.npd=npd;
		saved=true;
		newFileflag=true;
		fileName = new String("Untitled");

		fileRef = new File(fileName);

		this.npd.f.setTitle(fileName+" - "+ApllicateionTitle);  

		chooser = new JFileChooser();
		chooser.addChoosableFileFilter(new MyFileFilter(".java","Java Source Files(*.java)"));
		chooser.addChoosableFileFilter(new MyFileFilter(".txt","Text Files(*.txt)"));
		chooser.setCurrentDirectory(new File("."));
	}
	boolean saveFile(File temp)  {
		try {
			FileWriter fout= new FileWriter(temp);
			fout.write(npd.ta.getText());
		} catch (IOException ioe) {

			updateStatus(temp,false);
		}
		finally {
			try{

			}catch(IOException exp){}
		}
		updateStatus(temp, true);
		return true;
	}
	/////////////////////////
	boolean savethisFile()
	{  
		if(!newFileflag){
			return saveFile(fileRef);
		}
		return saveAsFile();
	}
	boolean saveAsFile(){
		File temp=null;
		chooser.setDialogTitle("Save as..");
		chooser.setApproveButtonText("Save now");
		chooser.setApproveButtonMnemonic(KeyEvent.VK_S); 
		chooser.setApproveButtonToolTipText("Click me to save");

		do
		{
			if(chooser.showSaveDialog(this.npd.f)!=JFileChooser.APPROVE_OPTION)
				return false;
			temp=chooser.getSelectedFile();
			if (!temp.exists())break;

			if (JOptionPane.showConfirmDialog(this.npd.f,"<html>"+temp.getPath()+"Already exist.<br>Do you want to replaceit<html>","Save as",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);

		}while(true);
		return saveFile(temp);

	}
	boolean openFile(File temp){
		
		FileInputStream fin=null;
		BufferedReader din= null;
	try{
		fin= new FileInputStream(temp);
		din= new BufferedReader(new InputStreamReader(fin));
		String str="";
		while (str!=null){
			str=din.readLine();
			if(str==null)
				break;
			this.npd.ta.appened(str+"\n");
		}
	}catch(IOException ioe){
		updateStatus(temp, false);
	}	
	finally{
		try{
			fin.close();
			din.close();
		}catch(IOException excp){}
	}
	updateStatus(temp, true);
	this.npd.ta.setCaretPosition(0); 
		return true;
		
	}
	void openFile(){
		if(!confirmSave())return;
		chooser.setDialogTitle("Open File...");
		chooser.setApproveButtonText("Open this");
		chooser.setApproveButtonMnemonic(KeyEvent.VK_O);
		chooser.setApproveButtonToolTipText("Click me to open the selected file");
		File temp= null;
		do {
			if (chooser.showOpenDialog(this.npd.f)!=JFileChooser.APPROVE_OPTION)
				return;
			temp=chooser.getSelectedFile();
			if (temp.exists())break;
			JOptionPane.showConfirmDialog(this.npd.f,"<html>"+temp.getName()+"<br>File Not Found"+"Please verify the correct file name was given.<html>","Open",JOptionPane.INFORMATION_MESSAGE);
		}while(true);
		this.npd.ta.setText("");
		if(!openFile(temp))
		{
			fileName="Untitled";saved true;
	        this.npd.f.setTitle(fileName+" - "+ApllicateionTitle);  
		}
		if(!temp.canWrite()){
			newFileflag=true;
		}
	}	
	
	private void updateStatus(File temp, boolean saved) {
		if (saved){
			this.saved=true;
			fileName= new String(temp.getName());
			if(!temp.canWrite()){
				fileName+="Read Only";newFileflag=true;
				fileRef=temp;
				npd.f.setTitle(fileName + " - "+ApllicateionTitle);  
				npd.l.setText("File : "+temp.getPath()+" saved/opened successfully."); 
				newFileflag = false;		
			}else{
				npd.l.setText("Failed to save/open : "+temp.getPath()); 
			}
		}
	}
		private boolean confirmSave() {
			String strmsg= "<html>The text in the file "+fileName+ " has been changed.<br>"+" Do you want to save the changes?<html>";
			
			if (!saved){
				int x= JOptionPane.showConfirmDialog(this.npd.f,strmsg,ApllicateionTitle,JOptionPane.YES_NO_CANCEL_OPTION);
				if(x==JOptionPane.CANCEL_OPTION)return false;
				if(x==JOptionPane.YES_OPTION && !saveAsFile())return false;
				
			}
			
			return true;
		}
	void newFile(){
		if(!confirmSave())return ;
	this.npd.ta.setText("");
	fileName= new String("Untitled");
	fileRef = new File(fileName);
	saved =true;
	newFileflag=true;
	this.npd.f.setTitle(fileName+"-"+ApllicateionTitle);
	
	}
}
public class MyNotepad implements ActionListener,MenuConstants {
	// Set Frame and Variable 
	 JFrame f;
     JLabel l;
     JTextArea ta;  
	// Default 
	private String FileName="Untitled" ;
	private boolean saved= true;
	private String ApplicationName="Javapad";
	String searchString,replaceString;
	int lastsearchIndex;

	Fileoperation fileHandler;
	FontChooser fontDialog=null;  
	FindDialog findReplaceDialog=null;   
	JColorChooser bcolorChooser=null;  
	JColorChooser fcolorChooser=null;  
	JDialog backgroundDialog=null;  
	JDialog foregroundDialog=null;  
	JMenuItem cutItem,copyItem, deleteItem, findItem, findNextItem,  
	replaceItem, gotoItem, selectAllItem;  



	MyNotepad(){
		f= new JFrame();
		ta=new JTextArea();
	}




	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	public static void main (String []args){
		new MyNotepad();
	}

}
