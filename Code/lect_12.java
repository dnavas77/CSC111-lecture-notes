class lect_12
{
   public static void main(String[] a)
   {
      // reference types
      // write method that checks 2 string are equal
      System.out.println(areStringEqual("danilo", "danilo"));
      System.out.println(areStringReverse("danilo", "olinad"));
   }

   static boolean areStringEqual(String a, String b)
   {
      if (a.length() != b.length()) return false;

      for (int i = 0; i < a.length(); i++)
      {
         if (a.charAt(i) != b.charAt(i)) return false;
      }

      return true;
   } // end areStringEqual method

   // write method that checks if string a is reverse of string b
   static boolean areStringReverse(String a, String b)
   {
      if (a.length() != b.length()) return false;

      for (int i = 0; i < a.length(); i++)
      {
         if (a.charAt(i) != b.charAt(a.length()-(i+1))) return false;
      }

      return true;
   }

} // end lect_12 class
