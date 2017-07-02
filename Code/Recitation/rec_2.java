//Write a program that asks the user for 3 double numbers and calculate average.

class	rec_2 {
	// main entry
	public static void main (String[] args) {

		System.out.println("Enter 3 decimal numbers: ");
		double a = IO.readDouble();
		System.out.println("Entry 1: " + a);
		double b = IO.readDouble();
		System.out.println("Entry 2: " + b);
		double c = IO.readDouble();
		System.out.println("Entry 3: " + c);

		System.out.println("");
		System.out.println("Average of 3 numbers is: " + average(a,b,c));
	}

	static double average (double a, double b, double c) {
		double avg = (a+b+c)/3;
		return avg;
	}
}