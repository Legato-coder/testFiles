package Collections;

import java.util.ArrayList;

public class Modifyorchange {
	
	public static void main(String[] args) {
		
		//To modify an element, use the set() method and refer to the index number:
		
		ArrayList<String> marry = new ArrayList<String>();
		
		marry.add("hey neha");
		marry.add("hey sirisha");
		marry.add("hey samantha");
		marry.add("payal ghosh");
		marry.add("priya bangalore");
		
	marry.set(2, "keerthy suresh");
	marry.set(4, "hyderabad");
	
	
	System.out.println(marry);
		
		
	}
	
	

}
