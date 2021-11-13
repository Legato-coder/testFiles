package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraySort {
	
	public static void main(String[] args) {

		
		
		List<Integer> al=new ArrayList<Integer>();  
		al.add(34);  
		al.add(2);
		al.add(10);
		al.add(100);
		al.add(5);
		al.add(20);
		
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
		}
	}

}
