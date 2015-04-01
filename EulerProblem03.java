//Kyle Riedemann
//1-12-2015

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

import java.lang.Math;

public class EulerProblem03 {
	public static void main(String[] args) {
		long number = 600851475143L;
		long out = 0;

		for (long i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0 && isPrime(i)) out = i;
		}
		System.out.println(out + " is the largest prime factor of " + number);
	}

	public static boolean isPrime(long n) {
		if (n % 2 == 0) return true;
		for (long i = 3; i < n; i += 2) {
			if((n % i) == 0) return false;
		}
		return true;
	}
}
