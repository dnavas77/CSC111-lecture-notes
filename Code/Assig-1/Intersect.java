/***
 * Rutgers University - New Brunswick. Spring 2015.
 *
 * Assignment 1 for CSC-111
 * Completed: Feb 21, 2015.
 * Student: Danilo Navas
 * Professor: Andrew Tjang
 --------------------------------*/
public class Intersect {
	// main
	public static void main (String[] args) {

		// Variable declaration and initialization
		double d = 0, f=0, g=0, m=0, b=0, tempB=0, tempC=0, xValue1=0, xValue2=0, yValue1=0, yValue2=0;

		// Display program description.
		System.out.println("\nThis program finds the intersection points, if any, \nbetween 2 equations of the following form:\n");
		System.out.println("Quadratic: y = dx^2 + fx + g");
		System.out.println("Linear: y = mx + b\n");

		// Prompt user for values and store in declared variables.
		System.out.print("Enter constant d: ");
		d = IO.readDouble();
		System.out.print("Enter constant f: ");
		f = IO.readDouble();
		System.out.print("Enter constant g: ");
		g = IO.readDouble();
		System.out.print("Enter constant m: ");
		m = IO.readDouble();
		System.out.print("Enter constant b: ");
		b = IO.readDouble();

		// calculations
		tempB = f - m;
		tempC = g - b;

		if ( (Math.pow(tempB, 2) - (4 * d * tempC) ) < 0) {
			System.out.println("\nThe intersection(s) is/are:\nNone");
			return;
		}

		xValue1 = (-tempB + Math.sqrt(Math.pow(tempB, 2) - (4 * d * tempC))) / (2 * d);
		xValue2 = (-tempB - Math.sqrt(Math.pow(tempB, 2) - (4 * d * tempC))) / (2 * d);

		yValue1 = m*xValue1 + b;
		yValue2 = m*xValue2 + b;

		/*
			 ********** Output intersection points ******************
			if xValue1 and xValue2 are undefined output "none"
			else if xValue1 is undefined only output intersection for xValue2
		   else if xValue2 is undefined only output intersection for xValue1
		   else if both values are valid, output both intersection points.
		*/
		System.out.println("\nThe intersection(s) is/are:");
		if ( Double.isNaN(xValue2) && Double.isNaN(xValue1) ) {
			System.out.println("None");
		} else if ( Double.isNaN(xValue1) ) {
			System.out.println("(" + xValue2 +", "+ yValue2 + ")");
		} else if ( Double.isNaN(xValue2) ) {
			System.out.println("(" + xValue1 +", "+ yValue1 + ")");
		} else {
			System.out.println("(" + xValue1 +", "+ yValue1 + ")");
			System.out.println("(" + xValue2 +", "+ yValue2 + ")");
		}
	}
}