package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Removemethod {
	public static void main(String[] args) {
		
		List<String> ab=new ArrayList<String>();
		
		ab.add("hyderabad");
		ab.add("sachin");
		ab.add("punjab");
		ab.remove(1);
		
		System.out.println(ab);
		
	}

}
