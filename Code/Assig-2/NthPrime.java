/***
 * Rutgers University - New Brunswick. Spring 2015.
 * Program: NthPrime.java
 * Assignment 2 for CSC-111
 * Completed: March 7, 2015
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 *********************************/

class NthPrime {
	// main
	public static void main (String[] args) {
		// program
		int n = 0, response = 0, count = 0;

		System.out.print("Enter n: ");
		n = IO.readInt();

		while (n < 1) {
			IO.reportBadInput();
			System.out.print("Enter n: ");
			n = IO.readInt();
		}

		for (int i = 2; i > 1; i++) {
			// break when Nth prime is reached.
			if (count == n) {
				break;
			}
			// find consecutive primes
			for (int j = 2; j > 0 ; j++) {
				if (i == j) {
					response = i;
					count++;
				}
				if (i % j == 0) {
					break;
				}
			} // end inner for loop

		} // end for loop

		// output response
		System.out.println();
		IO.outputIntAnswer(response);

	} // end main method

} // end NthPrime class
