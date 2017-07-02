class lect_09 {
	// main
	public static void main (String[] args) {
		// program
      // int num = 0;
		// int total = 0;
      //
      // do {
      //    total += num;
      //    System.out.println("enter number:");
		// 	num = IO.readInt();
      // }
		// while (num >= 0);
      // System.out.println(total);

      // given positive integer


      // write program that prints from 1 to n^2. Print multiplication table.
		int n = 0;
      System.out.print("Enter n: ");
      n = IO.readInt();

		for (int i2=1 ; i2 <=n ; i2++ ) {
			for (int i=1; i<=n ; i++ ) {
				System.out.print(i*i2+"\t");
			}
			System.out.println();
		}

		//write method header that let me know if number is prime.
		System.out.print("n: ");
		int number = IO.readInt();
		boolean primeIs = isPrime(number);
		System.out.println(primeIs);
	}

	public static boolean isPrime (int number) {
		boolean isprime = false;

		if (number%2 == 0 || number%3 == 0) {
			isprime = false;
		}
		isprime = true;

		return isprime;
	}
}
