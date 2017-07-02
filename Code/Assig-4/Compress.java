/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 4 for CSC-111
 * Due: April 08, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/

class Compress
{
   public static void main (String[] args)
   {
      // Variable declaration and initialization.
      String input = null, output = "";
      int counter = 1, i;

      System.out.println("Enter a string:");
      input = IO.readString();

      while (input.isEmpty())
      {
         System.out.println("Enter a valid string:");
         input = IO.readString();
      }

      if (input.length() == 1)
      {
         IO.outputStringAnswer(input);
         return;
      }

      // process input
      for (i = 0; i < input.length()-1; i++)
      {
         if (input.charAt(i) == input.charAt(i+1))
         {
            counter++;

            if ( i == input.length()-2)
               output += "" + counter + "" + input.charAt(i);
         }
         else
         {
            if (counter == 1)
               output += "" + input.charAt(i);
            else
            {
               output += "" + counter + "" + input.charAt(i);
               counter = 1;
            }

            if (counter == 1 && i == input.length()-2)
               output += "" + input.charAt(i+1);
         } // end else

      } // end for

      IO.outputStringAnswer(output);
   }// end main
}