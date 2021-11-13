package Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AllmapclassclassicExample {
	public static void main(String[] args) {
		
	
	HashMap<Integer, String> england = new HashMap<Integer, String>();
	england.put(1, "honeybee");
	england.put(2, "india");
	england.put(3, "rome");
	
	LinkedHashMap<Integer, String> aj = new LinkedHashMap<Integer, String>();
	aj.put(1,"honeybee");
	aj.put(2,"indiad");
	aj.put(3,"rome");
	
	TreeMap<Integer,String> buy=new TreeMap<Integer,String>();
	buy.put(1,"honeybee");
	buy.put(2,"india");
	buy.put(3,"rome");
	
	System.out.println(england);
	System.out.println(aj);
	System.out.println(buy);
	
	
	}

}
