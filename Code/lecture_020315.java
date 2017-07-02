import java.util.Scanner;
import java.lang.Math;

class	lecture_020315 {
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
	}
}