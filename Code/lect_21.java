class lect_21 {
   public static void main(String[] args) {
      // lecture 21
		// RECURSION
		// Program that calculates fibonacci sequence.
		fib(4);
		while (true) {
			int i = fact(IO.readInt());
			System.out.println("factorial:" + i);
		}
   } // end main

	// BINARY SEARCH with Recursion
	private static void recursiveBinarySearch(int[] arr) {
		// prof did not write it. is it possible? Yes, look it up.
	}

	// find fibonacci numbers.
	private static int fib(int n) {
		/*
			fib(n) = fib(n-1) + fib(n-2)
			BASE CASE:
			fib(1) = 1
			fib(2) = 1
		*/
		if (n == 1 || n == 2) return 1;

		return fib(n-1) + fib(n-2);
	}

	// find n! factorial using recursion
	private static int fact(int n) {
		// base case
		if (n == 1 || n == 0) return 1;

		return n * fact(n-1);
	}
} // end lect_20 class
