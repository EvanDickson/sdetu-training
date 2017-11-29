// Evan Dickson
// November 23, 2017
// A function to determine the value of n factorial

package Basics;

public class Lab1Q2 {

	public static void main(String[] args) {
		// We gonna calculate a factorial
		System.out.println(ourFactorial(7)); //we can replace '7' with whichever number we choose
		}
	public static int ourFactorial(int n) {
		if (n == 0) {return 0;}
		else if (n == 1) {return 1;}
		System.out.println(n + " factorial is "+ n + " times " + (n-1) + " factorial.");
		return (n*ourFactorial(n-1));
	}
}
