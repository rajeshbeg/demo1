package demo.demo;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main (String[]args){
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(101, "Ramesh");
		map.put(102, "amar");
		map.put(103, "Ramesh");
	
		for (Map.Entry m: map.entrySet()){
			System.out.println(m.getKey()+":"+ m.getValue());
		}
		
	}

}
