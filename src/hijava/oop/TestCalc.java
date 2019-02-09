package hijava.oop;

public class TestCalc implements Calc{

	@Override
	public void mul(int i, int j) {
		System.out.println(i*j);
		
	}

	@Override
	public void add(int i, int j) {
		System.out.println(i+j);
		
	}

	@Override
	public void div(int i, int j) {
		System.out.println(i/j);
		
	}

	@Override
	public void sub(int i, int j) {
		System.out.println(i-j);
		
	}

}
