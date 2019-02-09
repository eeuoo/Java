package hijava.oop;

public abstract class NetSports {
	
	public abstract void serve();
	public abstract void hit();
	public abstract void score();

	public final void play() {
		serve();
		hit();
		score();
	}

}
