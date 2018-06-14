package demo.demo;

import java.util.HashMap;
import java.util.Map;

public class Prob1 {
	public static void main (String args[]){
		String s="How are you";
		int len = s.replaceAll("\\s","").length();
		// create a store of element
		Map<Character, Integer> numChar= new HashMap<Character, Integer>();
		for (int i=0;i<len;i++){
			char charAt= s.charAt(i);
			if (!numChar.containsKey(charAt)){
				numChar.put(charAt, 1);
			}else{
				numChar.put(charAt,numChar.get(charAt)+1);
			}
		}
		System.out.println(numChar);
		
	}

}
