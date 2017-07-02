/***
 * Rutgers University - New Brunswick. Spring 2015.
 * Program: TwoSmallest.java
 * Assignment 2 for CSC-111
 * Completed: March 7, 2015
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 *********************************/
class TwoSmallest {
	// main
	public static void main (String[] args) {
		// variables declaration and initialization
      double termValue=0, first=0, second=0, temp=0;

		// ask for terminating value.
      System.out.print("\nEnter terminating value: ");
      termValue = IO.readDouble();

		// save first two values
      System.out.println("Enter set of numbers: ");
		first = IO.readDouble();
		while (first == termValue) {
			System.out.println("Enter at least 3 values!");
			first = IO.readDouble();
		}

		second = IO.readDouble();
		while (second == termValue) {
			System.out.println("Enter at least 3 values!");
			first = IO.readDouble();
			second = IO.readDouble();
		}

		// if first value entered is greater than second, switch values.
		if (first > second) {
			double temp2 = first;
			first = second;
			second = temp2;
		}

		// loop through values entered and store 2 smallest.
      while (true) {
			temp = IO.readDouble();
			if (temp == termValue) break;

         if (temp <= first) {
				double temp2 = first;
				first = temp;
				second = temp2;
         }

			if (temp > first && temp < second) {
				second = temp;
         }
		} // end while loop

		// output 2 smallest numbers.
		System.out.println();
		IO.outputDoubleAnswer(first);
		IO.outputDoubleAnswer(second);

	} // end main function
}
