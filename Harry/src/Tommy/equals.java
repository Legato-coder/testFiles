package Tommy;

public class equals {

	public equals() {

	}

	public static void main(String[] args) {
		
		String master = "aabbccaadd";
		System.out.println(master.replaceAll("aa", "mm"));
		
		String coding = "aaccddbba";
		System.out.println(coding.replaceAll("a", "z"));
		
		//we can start here for the EQUAL OPTIONS 
		
		String kia = "learn java";
		String kia2= "learn python";
		String Kia3 = "learn java";

		System.out.println(kia.equals(kia2));
		System.out.println(kia.equals(Kia3));
		System.out.println(Kia3.equals(kia));
		
	}

}
