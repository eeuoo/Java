package hijava.oop;

public class Daughter extends Mom {
	public Daughter() {
		super("딸");
	}

	public Daughter(String name) {
		super(name);
	}

	public void say() {
		System.out.println("Daughter said ~");
	}

	public void tt() {
		System.out.println("TT");
	}
	
	public void drinkMilk() {
		System.out.println("Milk !!");
	}
}
