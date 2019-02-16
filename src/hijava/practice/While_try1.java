package hijava.practice;

public class While_try1 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while (i <= 100) {
			
			i++;
			
			switch ( i % 2 ){
			case 0 :
				continue ;
			case 1 :
				sum += i;
			
			}
		}
		
		System.out.println(sum);
		
		
	}

}
