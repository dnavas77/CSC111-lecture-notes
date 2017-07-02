//Write a program that asks the user for addition or substraction and

class	rec_4 {
	// main entry
	public static void main (String[] args) {
      // write program that asks user for integer and print them separately.
      int a=0, b=0, c=0;

      System.out.print("a: ");
      a = IO.readInt();

      for (int i=0; i<a ; i++ ) {
         System.out.print("enter number: ");
         b = IO.readInt();
         c += b;
      }
      System.out.println(c/a);


      // If user enters 245, print 5 4 2 in different lines.
      // while (a > 0 ) {
      //    System.out.println(a%10);
      //    a = a/10;
      // }


	}
}
