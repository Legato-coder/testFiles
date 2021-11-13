package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Foreachloop {
	
	public static void main(String[] args) {
		
		List<String> ab=new ArrayList<String>();
		ab.add("hello world");
		ab.add("haryana");
		ab.add("baxite");
		System.out.println(ab);
		
		
		
		for (String kim:ab) {
			System.out.println(kim);
		}
		
	}

}

//for each loop - this is the second way to Iterate the Array list
//for each is not recommended for Non. Generic.