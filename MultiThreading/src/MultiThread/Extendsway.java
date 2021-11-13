package MultiThread;

public class Extendsway extends Thread{

	public void run() {
		System.out.println("basics of java");
	}
	
	public static void main(String[] args) {
		
		Extendsway kim=new Extendsway();
		
		kim.start();
		kim.isAlive();
		
		System.out.println(kim.isAlive());
	}
	
}
