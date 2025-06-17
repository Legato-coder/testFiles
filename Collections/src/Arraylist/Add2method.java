package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Add2method {
	//thisss method will add the elements at the required index.
		public static void main(Integer[] args) {
			
			List<String> ab=new ArrayList<String>();
			
			
			ab.add("sachin");
			ab.add("punjab");
			//index always starts with 0.
			ab.add(1, "riya");
			System.out.println(ab);

		}
}
