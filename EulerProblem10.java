/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

import java.lang.Long;
import java.math.*;
import java.util.*;

public class EulerProblem10 {
    public static void main(String[] args){
        final int PRIMES_BELLOW = 2000000;
        long sum = 0;

        for(int num = 0; num < PRIMES_BELLOW; num++){
            if(primeCheck(num)) sum += num;
        }

        System.out.println(sum);

        // System.out.println(primeCheck(9));
        // System.out.println(primeCheck(17));
    }

    public static boolean primeCheck(int num){
        if (num == 1) return false;

        int sqrtNum = (int) Math.sqrt(num);
        for(int i = 2; i <= sqrtNum; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
