class rec_6
{
   public static void main(String[] args)
   {
      // ask user for number of rows and columns for 2d array
      // ask user to populate each index in array
      // calculate which row has greatest average value
      // int rows, columns;
      // int[][] my2dArray;
      //
      // System.out.println("Enter rows: ");
      // rows = IO.readInt();
      //
      // System.out.println("Enter columns:");
      // columns = IO.readInt();
      //
      // my2dArray = new int[rows][columns];
      //
      // System.out.println("Enter values for array:");
      //
      // for (int i = 0; i < my2dArray.length; i++)
      // {
      //    for (int j = 0; j < my2dArray[0].length; j++)
      //    {
      //       my2dArray[i][j] = IO.readInt();
      //    }
      // } // end for
      //
      // // calculate average of rows
      // int avg1 = 0, avg2 = 0, highest = 0;
      //
      // for (int i = 0; i < my2dArray.length; i++)
      // {
      //    for (int j = 0; j < my2dArray[0].length; j++)
      //    {
      //       avg1 += my2dArray[i][j];
      //    }
      //    if (avg1 > avg2)
      //    {
      //       avg2 = avg1;
      //       highest = i;
      //       avg1 = 0;
      //    }
      //
      // } // end for
      //
      // System.out.println(highest);

      System.out.println();

      // reverse string
      System.out.println("Enter String to reverse:");
      String s = IO.readString();
      String rev = "";
      char[] a = new char[s.length()];

      for (int i = 0; i < s.length(); i++)
      {
         a[i] = s.charAt(s.length()-(i+1));
      }

      for (int i = 0; i < a.length; i++)
      {
         System.out.print(a[i]);
      }
      System.out.println();

      // Ask for String
      // ask for substring
      // check if substring is larger than string
      System.out.println("Enter string:");
      String n = IO.readString();

      System.out.println("Enter start number for substr:");
      int b = IO.readInt();
      System.out.println("Enter end number for substr:");
      int c = IO.readInt();

      String t = n.substring(b,c);

      System.out.println(t);


   } // end main
}
