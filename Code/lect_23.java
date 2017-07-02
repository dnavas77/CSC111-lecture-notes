class lect_23 {
	public static void main(String[] args) {
		// // Lecture 23: RECURSION
		// // MERGE SORT
		// 		5 3 1 6 8 4 2 0
		// 		5 3 1 4		8 4 2 0
		// 	5 3   1 4		8 4   2 0
		// 5   3   1   4		8   4   2   0
		// // split list into to, then the 2 into 2 and so on until we have single
		// // values. sort smallest lists first, then merge with each other until
		// // all values are sorted and merged into a list size of the original.
	}

	private static void mergeSort(int[] arr, int lo, int hi) {
		// if lo and hi are equal, return;
		if (lo == hi) return;
		// pass first half of the array.
		mergeSort(arr, lo, (lo+hi)/2);
		// sort second half of array.
		mergeSort(arr, ((lo+hi)/2) + 1, hi)
		// merge halves
		merge(arr, lo, hi); // use insertion sort to sort merged list.
	}

	private static void moveTower(int tower, int source, int dest, int spare) {
		if (tower == 0) // move disk 0 to dest. <==> source -> dest
		
	}
}
