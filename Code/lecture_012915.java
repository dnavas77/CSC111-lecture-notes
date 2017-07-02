import java.util.Scanner;


class lecture_012915 {
	public static void main(String[] args){
		// Hello world.
		System.out.println("Hello Rutgers");

		// Convert fahrenheit to celcius
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");

     	int fa = sc.nextInt();

     	try {
         Integer.parseInt(fa);
         double celcius = (fa-32)/1.8000;
	     	System.out.println("Temperature in Celcius:");
	     	System.out.println(celcius);

      } catch (NumberFormatException e) {
         System.out.println("Please enter an integer.");
      }
	}
}