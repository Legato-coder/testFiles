package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddallMethod {
	
	public static void main(String[] args) {
		
List<String> ab=new ArrayList<String>();
		
		ab.add("hyderabad");
		ab.add("sachin");
		ab.add("ananthapur");
		ab.add("india");
		ab.add("america");
		
		List<String> dm=new ArrayList<String>();
		
		dm.add("abcd");
		dm.add("hello india");
		dm.add("person");
		dm.addAll(ab);
		
		System.out.println(dm);
		
		//just understand the addall method and try to refer you will get the picture.
	}

}
