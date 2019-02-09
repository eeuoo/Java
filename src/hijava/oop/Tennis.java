package hijava.oop;

public class Tennis extends NetSports{
	
	@Override
	public void serve() {
		System.out.println("service");
	}

	@Override
	public void hit() {
		System.out.println("stroke");
	}

	@Override
	public void score() {
		System.out.println("15");
	}

}
