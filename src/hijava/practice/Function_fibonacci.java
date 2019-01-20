package hijava.practice;

public class Function_fibonacci {

	public static void main(String[] args) {
		int inum = 10;
		for (int i = 0; i <= inum; i++) {
		System.out.print(" " + fibonacci(i));
		}
	}

	private static int fibonacci(int num) {
		
		if (num <= 1) return num ;
		
		return fibonacci( num - 1) + fibonacci( num - 2) ;
		
	}

}
