package hijava.practice;

public class Market {

	public static void main(String[] args) {
		Man hong = new Man("hong");
//		System.out.println(hong);
		hong.buyCoffe(1);
		hong.buyDoughnut(2);
		System.out.println(hong);
		
		Man john = new Man("john");
//		System.out.println(hong);
		john.buyCoffe(2);
		john.buyDoughnut(1);
		System.out.println(john);
	}
	

}
