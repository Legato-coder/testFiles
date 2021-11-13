package Hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class GetmethodHM {
	
public static void main(String[] args) {
		
		HashMap<Integer, String> england = new HashMap<Integer, String>();
		
		england.put(100, "santhosh");
		england.put(88, "Anjali");
		england.put(34, "rome");
		
		 Iterator itc=england.iterator();
		 while(itc.hasNext())
		 
		 System.out.println(itc.next());
		
		System.out.println(england.get(england));
		
		

		
}
}
