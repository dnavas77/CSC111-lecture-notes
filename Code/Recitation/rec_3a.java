//Write a program that asks the user for addition or substraction and

class	rec_3a {
	// main entry
	public static void main (String[] args) {

		boolean divBy3 = false;
		boolean divBy5 = false;

		System.out.print("\nEnter number: ");
		int num = IO.readInt();

		if (num%3 == 0 || num%10==3){
			divBy3 = true;
		}
		if (num%5==0 || num%10==5) {
			divBy5 = true;
		}

		if (divBy3 && divBy5) System.out.println("FizzBuzz\n");
			else if (divBy3) System.out.println("Fizz\n");
		 		else if (divBy5) System.out.println("Buzz\n");
	}
}