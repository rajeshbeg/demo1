package demo.demo;

import java.util.ArrayList;
import java.util.List;

public class duplicatenumber {
	public int findDuplicate(List <Integer>number){
		int heighestnumber= number.size()-1;
		System.out.println(heighestnumber);
		int total=getSum(number);
		System.out.println(total);
		int duplicatNumber=total-(heighestnumber*(heighestnumber+1)/2);
		return duplicatNumber;
	}
	
	private int getSum(List<Integer> number) {
		int sum=0;
		for(int num:number){
			sum+=num;
		}
		return sum;
	}

	public static void main (String args[]){
		List<Integer>number= new ArrayList<Integer>();
		for (int i=1;i<=30;i++){
			number.add(i);
		}
		number.add(32);
		duplicatenumber dn = new duplicatenumber();
		System.out.println(dn.findDuplicate(number));
	}

}
