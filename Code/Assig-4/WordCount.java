/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 4 for CSC-111
 * Due: April 08, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/

class WordCount
{
   public static void main (String[] args)
   {
      // Variable declaration and initialization.
      String sentence = null;
      String word = null;
      int minLength = 0, wordCount = 0;

      System.out.println("Enter a sentence:");
      sentence = IO.readString();

      sentence = sentence.trim();

      // sentence validation
      while (sentence.indexOf(' ') == -1)
      {
         System.out.println("Enter a valid sentence:");
         sentence = IO.readString();
         sentence = sentence.trim();
      }

      System.out.println("Enter minimum word length:");
      minLength = IO.readInt();

      while (minLength < 1)
      {
         System.out.println("Minimum word length must be at least 1:");
         minLength = IO.readInt();
      }

      // split string into words and check if each word satisfies min letter count.
      while (true)
      {
         word = sentence.substring(0, sentence.indexOf(' ')); // last word doesn't have a space!
         sentence = sentence.substring(sentence.indexOf(' ')); // remove first word from sentence
         sentence = sentence.trim();

         if (countLetters(word) >= minLength) wordCount++;

         if (sentence.indexOf(' ') == -1)
         {
            word = sentence;
            if (countLetters(word) >= minLength) wordCount++;
            break;
         }
      } // end while

      // output word count based on
      IO.outputIntAnswer(wordCount);

   }// end main

   // method to cound letters in a word.
   static int countLetters (String a)
   {
      int count = 0;
      for (int i = 0; i < a.length(); i++)
      {
         if ( Character.isLetter(a.charAt(i)) )
            count++;
      }
      return count;
   } // end countLetters
}