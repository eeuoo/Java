// 풀이 //

package hijava.practice;

public class for_try5 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;
		
			for( int j = 2; j < num; j++) {
				if(num % j == 0) {
					isPrime = false;
					break;	
				}
			
			}
			if (isPrime ) {
				sum += num;	
			}
		}
		
		System.out.println(sum);
	}

}
