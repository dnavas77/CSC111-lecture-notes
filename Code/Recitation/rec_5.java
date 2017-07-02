class rec_5 {
   public static void main (String[] args) {
      // ask user for size of array and ask for values for each index
      // print amount of boxes for every value given in every index.

      System.out.println("Enter array size: ");
      int arraySize = IO.readInt();

      int[] myArray = new int[arraySize];

      // ask user to enter value for every index in array.
      for (int i = 0; i < myArray.length; i++ ) {
         System.out.println("Enter value for element " + (i+1) + ": ");
         myArray[i] = IO.readInt();
      }

      // print boxes horizontally
      for (int i = 0; i < myArray.length; i++ ) {
         for (int j = 0; j < myArray[i]; j++) {
            System.out.print("[]");
         }
         System.out.println();
      }

      // space between loops
      System.out.println();

      // find largest number in array
      int height=0;
      for (int i=0; i < myArray.length; i++) {
         if (myArray[i] > height) height = myArray[i];
      }

      // print boxes vertically
      for (int j = height; j>0; j--) {

         for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] >= height) System.out.print("[]");
            else System.out.print("  ");

         } // end inner loop
         height--;
         System.out.println();
      } // end for loop

   }
}
