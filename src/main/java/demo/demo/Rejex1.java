package demo.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rejex1 {
	public static void main (String args[]){
		// 1 st way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		//2nd way
		boolean b2= Pattern.compile(".s").matcher("as").matches();
		
		
		// 3rd way
		
		boolean b3= Pattern.matches(".s", "as");
		
	}

}
