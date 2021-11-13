package Exceptions;

public class trycatch {
	
	 public static void main(String[] args) {
	
int a=10;
int b=20;
int c=25;
int d=30;
int m=41/10;


try {
String sid="hellod";
System.out.println(sid.charAt(8));   //declaring try-catch
}catch(Exception dep) {
	System.out.println(dep);
}

try {
int k=7/0;
System.out.println(k); 
} catch (Exception e) {           //declaring try-catch
System.out.println(e);
}


try {
int e=44/0;
System.out.println(e);          //declaring try-catch
} catch (Exception nag) {
	System.out.println(nag);
}

System.out.println(d);
System.out.println(m);
System.out.println(a+b+c);


	 }
}

//easy to give Try and Catch to overcome an Excpetion
