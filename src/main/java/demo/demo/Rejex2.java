package demo.demo;

import java.util.regex.Pattern;

public class Rejex2 {
  public static void main (String args[]){
	  // rejex example and rejex is .s
	  
	  boolean b= Pattern.matches(".s", "as");// result is true
	  boolean b2= Pattern.matches(".s", "asm");// False , three characters
	  boolean b3=Pattern.matches("..s", "mss");// true
	  
  }
}
