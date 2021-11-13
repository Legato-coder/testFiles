package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


import java.util.List;

public class Addmethod {
	
	public static void main(String[] args) {
		
		List<Integer> ab=new ArrayList<Integer>();
		
		
		ab.add(100);
		ab.add(60);
		ab.add(80);
		ab.add(20);
		ab.add(10);
		
		
	Comparator<? super Integer> list = null;
	ab.sort(list);
		System.out.println(ab);
		
		
	}

}
