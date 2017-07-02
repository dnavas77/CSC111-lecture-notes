/***
 * Rutgers University - New Brunswick. Spring 2015.
 * Program: Scores.java
 * Assignment 2 for CSC-111
 * Completed: March 7, 2015
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 *********************************/

class Scores {
	// main
	public static void main (String[] args) {
		// variable declaration and initialization.
		int judges = 0;
		double hi=10, low=0, value=0, result=0;

		System.out.print("Enter numbers of judges: ");
		judges = IO.readInt();

		while (judges < 3) {
			IO.reportBadInput();
			System.out.print("Enter numbers of judges: ");
			judges = IO.readInt();
		} // end while

		for ( int i = 0; i < judges; i++ ) {
			value = IO.readDouble();

			while (value < 0 || value > 10) {
				IO.reportBadInput();
				value = IO.readDouble();
			} // end while

			if (value > low) {
				low = value;
			}
			if (value < hi) {
				hi = value;
			}

			result += value;

		} // end for loop

		result = (result-low-hi)/(judges-2);
		System.out.println();
		IO.outputDoubleAnswer(result);

	} // end main
}
