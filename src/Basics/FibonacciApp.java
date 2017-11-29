package Basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the sum of the two previous numbers in the series
		
		System.out.println(fib(5));
/*		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));*/



	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n ==1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
