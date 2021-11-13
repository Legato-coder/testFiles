package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hasnextMethod {
	
	//we we use hasnext in iteration purpose, refer more
	
	public static void main(String[] args) {
		
		
 List lion = new ArrayList<>();  
		 
		 lion.add("10");
		 lion.add("5");
		 lion.add("660");
		 
		 
		 Iterator itc=lion.iterator();
		 while(itc.hasNext())
		 
		 System.out.println(itc.next());
	
		
		
	}

}
