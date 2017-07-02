//Write a program that asks the user for addition or substraction and

class	rec_3 {
	// main entry
	public static void main (String[] args) {

		int num1=0, num2=0;

		System.out.println("\nEnter number of operation to perform:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");

		int selection = IO.readInt();

		System.out.println("\nEnter first number:");
			num1 = IO.readInt();
			System.out.println("Enter second number:");
			num2 = IO.readInt();

		if (selection == 1) {
			System.out.println("Operation selected: Addition");


			System.out.println("\nThe result of the addition is: " + (num1+num2));

		} else if (selection == 2) {

			System.out.println("\nThe result of the substraction is: " + (num1-num2) + "\n");

		} else {
			System.out.println("Error:Invalid selection.\n");
		}

	}

}