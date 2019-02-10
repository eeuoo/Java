package hijava.oop;

public class Oper {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;

	}

	public int mul(int i, int j) {
		int k = i;
		for (int a = 1; a < j; a++) {
			k = add(k, i);
		}
		return k;
	}

	public int div(int i, int j) {

		int m = 0;
		while (i > 0) {
			if(i < j) {break;}
			i = sub(i,j);
			m++;
		}

		return m;
	}

}
