import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class Myclient {
	public static void main (String[]args){
		try {
			Socket s = new Socket("localhost",6666);
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Rajesh");
			dout.flush();
			dout.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

