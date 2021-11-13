package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForloopArraylist {
	public static void main(String[] args) {
		
		List<String> ab=new ArrayList<String>();
		ab.add("hello world");
		ab.add("haryana");
		ab.add("amrutsar");
		System.out.println(ab);
		
		for(int i=0;i<ab.size();i++) {
			System.out.println(ab.get(i));
		}
		
		
		
	}

}
