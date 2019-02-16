package hijava.practice;

public class Market {

	public static void main(String[] args) {
		Man2 hong = new Man2("hong");
		System.out.println(hong);
		hong.buyCoffe(1);
		hong.buyDoughnut(2);
		System.out.println(hong);
		
		Man2 john = new Man2("john");
		System.out.println(john);
		john.buyCoffe(2);
		john.buyDoughnut(1);
		System.out.println(john);
	}
	

}
