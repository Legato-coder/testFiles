package superkeyword;

public class InvariableB extends InvariableA{
	
int pulsar=100;
String color="black";  //we have color method even in class A
String oil="rose oil";


void message() {
	
	System.out.println(pulsar);
	System.out.println(super.pulsar); //by using super, it will the parent class
	System.out.println(super.color); // by using super, it will call parent class
	System.out.println(super.oil);
}
}
