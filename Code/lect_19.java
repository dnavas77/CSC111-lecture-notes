class lect_19 {
   public static void main(String[] args) {
      // lecture 18


   } // end main

   static void selectionSort(String[] arr) {
      for (int j = 0; j < arr.length; j++) {
         Sring min = arr[j];
         int index = j;

         for (int i = j; i < arr.length; i++) {
            if (min > arr[i]) {
               min = arr[i];
               index = i;
            }
         }
      }
   } // end selectionSort()

   static void insertionSort(int[] arr) {
      for (int i=1; i < arr.length; i++) {
         for (int j=i; j >= 0; j--) {
            // compare
            if () {
               // if greater, break
            }
            // swap
         }
      }
   } // end insertionSort()

} // end lect_19 class
