package loops;

public class Exp1 {

	public static void main(String[] args) {

		int num, rem;
		num = 1234567289;
		int oddcount=0;
		

		while (num > 0) {
			rem = num % 10;
			if (rem % 2!=0) { 
			oddcount--;
			} 
		}
		
		System.out.println(oddcount);
	}

}
