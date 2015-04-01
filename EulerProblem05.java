//Kyle Riedemann
//1-18-2015

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class EulerProblem05 {
	public static void main(String[] args) {
		boolean solutionFound = false;
		int testNum = 100;
		while(!solutionFound){
			testNum++;
			solutionFound = divisibleLoop(testNum);
		}
		System.out.println(testNum + " is the smalllest positive number that is evenly divisible by all of the numbers 1-20");
	}

	public static boolean divisibleLoop(int testNum){
		for(int i = 2; i < 21; i++){
			if(testNum % i != 0) return false;
		}
		return true;
	}
}
