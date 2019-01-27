package hijava.practice;

public class Arr2 {

	public static void main(String[] args) {
		abc();

	}

	private static void abc() {
		char[][] abc = new char[2][26];
		int len = abc.length;
		int i1 = 65;
		int i2 = 97;

		for (int m = 0; m < len; m++) {
			for (int n = 0; n < abc[m].length; n++) {
				if (m == 0) {
					int x = (i1 + n);
					abc[m][n] = (char) x;

				} else {
					int x = (i2 + n);
					abc[m][n] = (char) x;
				}
			}
		}

		for (int k = 0; k < abc.length; k++) {
			for (int l = 0; l < abc[k].length; l++) {
				System.out.print(abc[k][l]);
			}
			System.out.println();
		}
	}
}
