class lect_07 {
	// main
	public static void main (String[] args) {
		//loops

		// given list of integers, as soon as negative integer is entered, returned the sum of the positive numbers.
		//INPUT:
		//OUTPUT:
		//ERROR Conditions:
		int num = 0;
		int total = 0;

		while (num >= 0) {
			System.out.println("enter number:");
			num = IO.readInt();

			total += num;

			System.out.println(total);
		}
	}
}