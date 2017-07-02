class rec_10 {

	public static void main(String[] args) {
		// Recitation 10
		// Binary Search with Strings
		String[] names = {"Elephant", "Dog", "Cat", "Bigfoot", "Bird", "Alpaca", "Buffalo", "Rhinoraurus", "Dogzilla", "Beagle", "Termite", "Hamster", "Penguin"};
		selectionSort(names);
		int index = binarySearch(names, "Bigfoot");

		System.out.println(index);
	} // end main


	public static void selectionSort(String[] names) {
      for (int i = 0; i < names.length - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < names.length; j++) {
              // "<" changed to use of compareTo()
              if (names[j].compareTo(names[minIndex]) < 0) {
                 minIndex = j;
              }
          }
          // int changed to String
          String temp = names[i];
          names[i] = names[minIndex];
          names[minIndex] = temp;
      }
   } // end selection sort

	private static int binarySearch(String[] names, String target) {
		int lo = 0;
		int hi = names.length-1;
		int mid = (lo + hi) / 2;

		while (true) {
			if (names[mid].equals(target)) {
				return mid;
			}
			if (target.compareTo(names[mid]) > 0) lo = mid+1;
			else hi = mid-1;

			mid = (lo + hi) / 2;
		}
	}

} // end rec_10 class
