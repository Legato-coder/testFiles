package Collections;

import java.util.LinkedList;

public class Addfirstmethod {
	
	public static void main(String[] args) {
		
		LinkedList<String> goa = new LinkedList<String>();
		
		goa.add("dancing");
		goa.add("drinking");
		goa.add("climatic changes");
		
		goa.addFirst("element of surprise");
		
		System.out.println(goa);
	}

}
