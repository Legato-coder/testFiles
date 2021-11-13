package Hashmap;

import java.util.LinkedHashMap;

public class ValuesHM {

	
	
public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> england = new LinkedHashMap<Integer, String>();
		
		england.put(1, "honeybee");
		england.put(2, "india");
		england.put(3, "rome");
		
		System.out.println(england.values());
		//OP = [honeybee, india, rome]
		
}
}
