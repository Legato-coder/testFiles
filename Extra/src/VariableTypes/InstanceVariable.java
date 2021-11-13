package VariableTypes;

public class InstanceVariable {
	
	int a=1;
	int b=3;
	int c=6;  //Instance Varialbe Example
	int d=4;
	String app="hello world";
	String cisco="infosys world";
	
	public static void main(String[] args) {
		
		InstanceVariable dam=new InstanceVariable();
		System.out.println(dam.a);
		System.out.println(dam.b);
		System.out.println(dam.cisco);
	}
}
 // InstanceVariable = it is inside the class N outside the Method.
// to access Instance Variables, You must create the object to access them.