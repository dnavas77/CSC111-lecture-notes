/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 4 for CSC-111
 * Due: April 08, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/

class PigLatin
{
   public static void main (String[] args)
   {
      // Variable declaration and initialization.
      char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
      String wordInput = null;
      String output = null;
      Boolean isVowel = false;

      // Ask user for input.
      System.out.println("Enter a word:");
      wordInput = IO.readString();

      // Input validation
      while ( wordInput.indexOf(' ') >= 0 || wordInput.isEmpty() )
      {
         System.out.println("Word cannot contain spaces or be empty.");
         System.out.println("Enter a valid word:");
         wordInput = IO.readString();
      } // end while

      // Check if first letter in wordInput is a vowel.
      for (int i = 0; i < vowels.length; i++)
      {
         if (wordInput.charAt(0) == vowels[i])
         {
            isVowel = true;
            break;
         }
      } // end for

      // If first letter in wordInput is vowel add "way" at end of word,
      // otherwise, move consonant to end of string and add "ay".
      if (isVowel == true)
         output = wordInput + "way";
      else
         output = wordInput.substring(1) + wordInput.charAt(0) + "ay";

      // Output result to screen
      IO.outputStringAnswer(output);

   }// end main
}