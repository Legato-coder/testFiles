package Ben;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class rotten {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Host Relief workout\\Test123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("selenium with java");
		bw.write("selenium with python");
		bw.write("selenium with doomen");
		bw.write("selenium with windows");
		bw.write("selenium with microsift");
		
		System.out.println("finisher research");
		bw.close();
		
	}

}
