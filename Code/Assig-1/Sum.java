/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 1 for CSC-111
 * Completed: Feb 21, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/
class Sum {
	// main
	public static void main (String[] args) {

		System.out.println("\nHi, this program adds 2 integer numbers. Try it!");
		// Ask user for first root and store it into r1 integer variable.
		System.out.println("Enter 1st integer:");
		int num1 = IO.readInt();

		// Ask user for second root and store it into r2 integer variable.
		System.out.println("Enter 2nd integer:");
		int num2 = IO.readInt();

		// calculate addition
		int answer = num1+num2;

		System.out.println();
		// output answer to screen
		IO.outputIntAnswer(answer);
		System.out.println();
	}
}