package Collections;


//removeFirst(); to remove first element
//declaration at whiteboard
import java.util.LinkedList;

public class Removefirst {
	public static void main(String[] args) {
		
		LinkedList<String> kop = new LinkedList<String>();
		
		kop.add("michigean");
		kop.add("austin");
		kop.add("popmpeao");
		
		kop.removeFirst();
		
		System.out.println(kop);
	}

}
