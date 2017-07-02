class rec_9 {

   public static void main(String[] args){
      //
      String[] words = {"mango", "apple", "melon", "lemon", "coconut"};


      selectionSort(words);

      for (int i = 0; i < words.length; i++)
      {
         System.out.println(words[i]);
      }

      System.out.println();
      String s = IO.readString();

      int index = linearSearch(words, s);

      System.out.println(index);



   }


   public static void selectionSort(String[] arr)
   {
      for (int i = 0; i < arr.length - 1; i++)
      {
          int minIndex = i;
          for (int j = i + 1; j < arr.length; j++)
          {
              // "<" changed to use of compareTo()
              if (arr[j].compareTo(arr[minIndex]) < 0)
              {
                 minIndex = j;
              }
          }
          // int changed to String
          String temp = arr[i];
          arr[i] = arr[minIndex];
          arr[minIndex] = temp;
      }
   } // end selection sort


   public static int linearSearch (String[] arr, String s)
   {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals(s)) {
            return i;
         }
      }
      return -1;
   }

}
