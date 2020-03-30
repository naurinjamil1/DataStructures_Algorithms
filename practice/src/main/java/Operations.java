package main.java;

public class Operations {

	long getFactorial(int n) {
		
		if (n <= 2) {
			return n;
		}
		return n * getFactorial(n-1);
	}
	void getFibonacciSequence(int n1, int n2, int max) {
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 2; i <= max; i++) {
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
}
