class lect_13 {
   public static void main (String[] args) {
      //Write method that checks if every letter in string is a letter.
      //Character.isLetter(); // checks if character passed is letter;

      //Write method that takes 2 string, return string same as first
      // string except, remove instances where string 2 appears.
      String a = "I love cats, cat dog is not a cat";
      String b = "cat";

      String result = a.substring(0, a.indexOf(b));
      String result2 = a.substring( (a.indexOf(b)+b.length()), a.length() );

      String result3 = result + result2;

      result = result3.substring(0, result3.indexOf(b));
      result2 = result3.substring(                  ( result3.indexOf(b)+b.length() ),
                  result3.length()
         );

      result3 = result + result2;

      result = result3.substring(0, result3.indexOf(b));
      result2 = result3.substring(
                  ( result3.indexOf(b)+b.length() ),
                  result3.length()
         );

      result3 = result + result2;

      System.out.println(result3);

   } // end main
}