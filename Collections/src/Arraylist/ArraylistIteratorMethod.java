package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistIteratorMethod {

public static void main(String[] args) {
		
		List<String> ab=new ArrayList<String>();
		ab.add("hello world");
		ab.add("AP");
		ab.add("baxite");
		System.out.println(ab);
		
		

	Iterator<String> i=ab.iterator();
 	while(i.hasNext()) {
			System.out.println(i.next());
		}
}
}