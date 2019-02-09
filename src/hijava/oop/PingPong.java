package hijava.oop;

public class PingPong extends NetSports {

	@Override
	public void serve() {
		System.out.println("sky service");
	}

	@Override
	public void hit() {
		System.out.println("smash");
	}

	@Override
	public void score() {
		System.out.println("1");
	}

}
