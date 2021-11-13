package Encapsulation;

public class Bamla {
	
	public static void main(String[] args) {
		
		Asai kemp=new Asai();
		kemp.setAddress("ida bollaram");
		kemp.setCompanyname("legato technologies");
		kemp.setName("santhosh");
		kemp.setSSN(12345);
		
		
		System.out.println(kemp.getAddress());
		System.out.println(kemp.getCompanyname());
		System.out.println(kemp.getName());
		System.out.println(kemp.getSSN());
	}

}
