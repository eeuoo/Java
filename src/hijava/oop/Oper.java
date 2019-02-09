package hijava.oop;

public class Oper {
	

	public int add(int i, int j) {
		return i + j ;
	}


	public int sub(int i, int j) {
		return i - j ;
		
	}


	public int div(int i, int j) {
		
		for (int a=0; a<=j; a++) {
			i += i ;
		}
		return i ;
	}


	public int mul(int i, int j) {
		return i / j ;
	}


}
