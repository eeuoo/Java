package hijava.practice;

import java.util.ArrayList;

public class Al_prime {

	static ArrayList<Integer> primeList = new ArrayList<>();

	public static void main(String[] args) {

		int sum = 0;

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;

			isPrime = isprime(num);

			if (isPrime) {
				primeList.add(num);
				sum += num;
			}
		}

		System.out.println(sum);

	}

	private static boolean isprime(int num) {
		for (Integer j : primeList) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
