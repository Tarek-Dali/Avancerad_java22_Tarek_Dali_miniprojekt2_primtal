package model;

public class PrimeModel {
	private int amountOfPrimes = 0;
	private int counter = 2;

	public void showPrimes(int start, int finish) {
		
		if (start > finish) {
			System.out.println("Total amount of prime numbers is " + amountOfPrimes);
			return;
		}

		boolean prime = true;

		prime = isPrime(start++, counter, prime);
		if (prime) {
			System.out.println(start - 1);
			amountOfPrimes++;
		}

		showPrimes(start, finish);

	}

	public boolean isPrime(int start, int counter, boolean prime) {
		if(start == 0 || start == 1 || start < 0) {
			prime = false;
		}

		if (counter >= start) {
			return prime;
		}

		if (start % counter == 0) {

			prime = false;
		}

		return isPrime(start, ++counter, prime);

	}
}
