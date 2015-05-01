/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.math.*;

public class EulerProblem20 {
    public static void main (String[] args){
        System.out.println(calcFactorial(new BigInteger("100")));
        System.out.println(sumOfDigits(calcFactorial(new BigInteger("100"))));
    }

    public static long sumOfDigits(BigInteger input){
        long result = 0;
        char arr[] = new char[1000];

        arr = input.toString().toCharArray();

        for(int i = 0; i < arr.length; i++){
            result += arr[i] - '0';
        }

        return result;
    }

    public static BigInteger calcFactorial(BigInteger n){
        BigInteger one = new BigInteger("1");

        if(n.compareTo(one) <= 0){
            return new BigInteger("1");
        } else {
            return n.multiply(calcFactorial(n.subtract(one)));
        }
    }
}
