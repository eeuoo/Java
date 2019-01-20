package hijava.practice;

public class for_try5 {

	public static void main(String[] args) {
		
		int sum = 0;
	
		for (int i = 2; i <= 100; i++) {
			
			for (int j = 2; j <= i; j++) {
				
				if ( i % j == 0 ) {
					break;
				} 
				
				if ( j == i-1 || i == 2){
					sum += i ;
				}
			}
			
		}

		System.out.println(sum);
	}

}
