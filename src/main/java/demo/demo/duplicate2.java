package demo.demo;
import java.util.Arrays;

public class duplicate2 {
  public static void main (String args[]){
	  
	  int num[]=new int[]{1,2,3,4,1,3,5};
	  Arrays.sort(num);
	  for (int i=0;i<num.length-1;i++){
		  if(num[i]==num[i+1]){
			  System.out.println("Duplicate num:"+num[i+1] +"at location"+(i+1));
		  }
			  
		  }
	  }
}

