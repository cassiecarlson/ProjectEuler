//Kyle Riedemann
//1-18-2015

/*
A palindromic number reads the same both wajs. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem4 {
	public static void main(String[] args) {
		int product = 9009;
		String productString = Integer.toString(product);
		int result = 0;

		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				product = i * j;
				productString = Integer.toString(product);
				if(palindrimeCheck(productString) == true){
					if(result < product) result = product;
				}
			}
		}

		System.out.println(result + " is the largest palindromic number made from the product of a 3 digit number");
	}

	public static boolean palindrimeCheck(String item){
		if(item.length() % 2 != 0) return false;

		for(int i = 0; i < item.length(); i++){
			if(item.charAt(i) != item.charAt(item.length() - (i + 1))) return false;
		}

		return true;
	}
}