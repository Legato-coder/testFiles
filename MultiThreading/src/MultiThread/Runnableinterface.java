package MultiThread;

public class Runnableinterface implements Runnable {
	
	
	public void run() {
		
		System.out.println("multithreading Runnable interface");
	}
	
	public static void main(String[] args) {
		
		Thread tin=new Thread(new Runnableinterface());
		tin.start();
		tin.isAlive();
		
		
		
		
	}

}
