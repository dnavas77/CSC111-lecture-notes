/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 1 for CSC-111
 * Completed: Feb 21, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/
class Poly {
	// main
	public static void main (String[] args) {
		// integers declaration and initialization.
		int r1=0, r2=0, r3=0;

		// Ask user for first root and store it into r1 integer variable.
		System.out.println("Enter the first root:");
		r1 = IO.readInt();

		// Ask user for second root and store it into r2 integer variable.
		System.out.println("Enter the second root:");
		r2 = IO.readInt();

		// Ask user for third root and store it into r3 integer variable.
		System.out.println("Enter the third root:");
		r3 = IO.readInt();

		// Print canonical form of polynomial
		// (x - 5)(x + 3)(x - 2) = (x^2+3x-5x-15)(x-2) = x^3+(3x^2-2x^2-5x^2)+(-6x+10x-15x)+ (30)
		System.out.println("\nThe polynomial is:");
		System.out.println(calculatePolynomial(r1,r2,r3));
	}

	static String calculatePolynomial(int r1, int r2, int r3){
		// variables declaration and inititalization
		String thirdDegree = "x^3", secondDegree=null, firstDegree=null, constant=null;

		// Calculate and store second degree term
		int temp = -(r1+r2+r3);
		if (temp >= 0) {
			secondDegree = " + "+ temp + "x^2";
		}
		else {
			int temp2 = temp*(-1);
			secondDegree = " - " + temp2 + "x^2";
		}
		// End calculate and store second degree term

		// Calculate and store first degree term
		temp = (r1*r3)+(r2*r3)+(r1*r2);
		if (temp >= 0) {
			firstDegree = " + "+ temp + "x";
		}
		else {
			int temp2 = temp*(-1);
			firstDegree = " - " + temp2 + "x";
		}
		// End calculate and store first degree term

		// Calculate and store constant term
		temp = (r1*r2)*(-r3);
		if (temp >= 0) {
			constant = " + "+ temp;
		}
		else {
			int temp2 = temp*(-1);
			constant = " - " + temp2;
		}
		// End calculate and store constant term

		return thirdDegree+secondDegree+firstDegree+constant;
	}
}