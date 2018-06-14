package demo.demo;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver {
	public static void main (String[]args){
	try {
		ServerSocket ss= new ServerSocket(6666);
		Socket s= ss.accept();// estublish connection
				// Set Data Input 
		DataInputStream dis=new DataInputStream(s.getInputStream()); 
		String str = (String)dis.readUTF();
		System.out.println("Message: "+str);
				ss.close();
				s.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
	}

