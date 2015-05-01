/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/

public class EulerProblem30 {

    public static void main (String[] args){
        int sum = 0;
    	for(int i = 2; i < 1000000; i++){

    	    String numString = ""+i;
    	    int fifthPower = 0;

            for(int j = 0; j < numString.length(); j++){
                fifthPower += (int)Math.pow(Integer.parseInt("" + numString.charAt(j)), 5);
    	    }

    	    if(fifthPower == i){
                sum += fifthPower;
    	    }
    	}
    	System.out.println(sum);
    }
}
