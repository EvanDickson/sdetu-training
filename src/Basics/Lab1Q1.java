// Evan Dickson
// November 23, 2017
// A function to determine the sum of numbers from 1 to n

package Basics;

public class Lab1Q1 {

	public static void main(String[] args) {
		int someValue = 14; // 14 is an arbitrarily chosen value for n
		int total = 0;
		for (int i = 1; i <= someValue; ++i) {
			total = total + i;
			System.out.println("The inclusive sum of all numbers between 1 and "+ i +" is:  "+ total);
			}
		System.out.println("And the final total was "+ total);
	}
}
