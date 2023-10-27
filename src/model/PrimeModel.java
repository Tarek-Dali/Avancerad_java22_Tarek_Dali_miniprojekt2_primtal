package model;

public class PrimeModel {
	private int amountOfPrimes = 0;
	private int counter = 2;

	// A recursive method which shows all prime numbers between start and finish
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

	// A recursive method which returns prime as as it is (true) or false based on the if conditions
	// true means number is a prime number, false means number is not a prime number
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
