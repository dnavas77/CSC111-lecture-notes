import java.util.Scanner;
import java.lang.Math;

class	lecture_020515 {
	// main entry
	public static void main (String[] args) {

		// Convert fahrenheit to celcius
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");

     	int fa = sc.nextInt();
	   double celcius = (fa-32)/1.8000;
		System.out.println("Temperature in Celcius:");
		System.out.printf("%.2f\n", celcius);
		System.out.println("Please enter a number.");

		// Explicit cast JAVA
		double x = 10/3;
		System.out.println(x); // x = 3.0, after integer division result is cast into double and stored.

		int z = (int)3.1415;
		System.out.println(z); // NOT Allowed! This would not compile unless we cast it, (int)3.1415.

		int a = 'a'; // implicit cast works!
		System.out.println(a);
	}
}