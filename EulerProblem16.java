/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

import java.math.*;
import java.util.*;

public class EulerProblem16{
    public static BigInteger returnPowerOfTwo(int power){
        BigInteger result = new BigInteger("2");

        result = result.pow(power);

        return result;
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

    public static void main(String[] args){
        // System.out.println(returnPowerOfTwo(1000));
        // System.out.println("------------------");
        System.out.println(sumOfDigits(returnPowerOfTwo(1000)));
    }
}
