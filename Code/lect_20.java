class lect_20 {
   public static void main(String[] args) {
      // lecture 20
		INSERTION SORT, LINEAR SEARCH. BINARY SEARCH.


   } // end main

	public static void insertionSort(int[] arr){
		for (int i=1; i<arr.length; i++) {
			for (int j=i; j >= 1; j--) {
				if (arr[j-1] > arr[j]) {
					int tmp = arry[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				} else {
					break; // needed in insertion sort or it's just as selection sort.
				}
			}
		}
	} // end insertionSort()

	private static void binarySearch(int[] arr){
		// 1. calculate midpoint. MID = (lo + hi) / 2
		// 2. compare: if arr[mid]==target) return true;
		//					else if (arr[mid] > target) hi=mid-1
		//					else lo=mid-1
		// IF LOW IS ONE GREATER THAN HI, RETURN FALSE, element is not there.
	}

} // end lect_20 class
