public class Averages {

	public static void main (String[] args) {
		// Variables declaration and initialization.
		int numOfInputs = 0, i = 0;
		double[] doubleArray;

		// Ask user for number of inputs and store into numOfInputs variable.
		System.out.println("Enter numbers of inputs:");
		numOfInputs = IO.readInt();

		// If numOfInputs is less than 1, ask for input again.
		while	(numOfInputs < 1)
		{
			System.out.println("Enter a positive number:");
			numOfInputs = IO.readInt();
		}

		// Initialize doubleArray to numOfInputs variable.
		doubleArray = new double[numOfInputs];

		// Ask user for input.
		System.out.println("Enter numbers:");

		// Populate array with inputs entered by user on each index respectively.
		for (i = 0; i < doubleArray.length ; i++)
		{
			doubleArray[i] = IO.readDouble();
		} // end for loop

		System.out.println(); // Empty line for readability.

		min(doubleArray);
		max(doubleArray);
		sum(doubleArray);
		mean(doubleArray);
		median(doubleArray);
		mode(doubleArray);

	} // end main

	// Find min value and return it.
	static void min(double[] doubleArray)
	{
		double minVal = doubleArray[0];
		for (int i = 0; i < doubleArray.length ; i++)
		{
			if (doubleArray[i] < minVal) minVal = doubleArray[i];
		}
		IO.outputDoubleAnswer(minVal);
	}

	// Find max value and return it.
	static void max(double[] doubleArray)
	{
		double maxVal = 0;
		for (int i = 0; i < doubleArray.length ; i++)
		{
			if (doubleArray[i] > maxVal) maxVal = doubleArray[i];
		}
		IO.outputDoubleAnswer(maxVal);
	}

	// Find sum of all elements in array and return it.
	static void sum(double[] doubleArray)
	{
		double sum = 0;
		for (int i = 0; i < doubleArray.length ; i++)
		{
			sum += doubleArray[i];
		}
		IO.outputDoubleAnswer(sum);
	}

	// Find mean value and return it.
	static void mean(double[] doubleArray)
	{
		double sum = 0;
		for (int i = 0; i < doubleArray.length ; i++)
		{
			sum += doubleArray[i];
		}
		double mean = sum / doubleArray.length;
		IO.outputDoubleAnswer(mean);
	}

	// Find median value and return it.
	static void median(double[] doubleArray)
	{
		// Sort array from lowest to greatest.
		boolean switched = true;
		double median = 0, tmp = 0;
		int j = 0;

	   while (switched)
		{
	      switched = false;
	      j++;
	      for (int i = 0; i < doubleArray.length - j; i++)
			{
	         if (doubleArray[i] > doubleArray[i + 1])
				{
	            tmp = doubleArray[i];
	            doubleArray[i] = doubleArray[i + 1];
	            doubleArray[i + 1] = tmp;
	            switched = true;
	         }
			} // end for
	    } // end while

		// If array size is odd then print median
		if (doubleArray.length % 2 == 1)
		{
			median = doubleArray[doubleArray.length/2];
			IO.outputDoubleAnswer(median);
		}
		// Array size even, calculate median by adding 2 middle values and divide by 2.
		else if (doubleArray.length % 2 == 0)
		{
			median = (doubleArray[doubleArray.length/2] + doubleArray[(doubleArray.length/2) - 1]) / 2;
			IO.outputDoubleAnswer(median);
		}
	}

	// Find mode value and return it.
	static void mode(double[] doubleArray)
	{
		// Find mode and print value.
		double value1 = doubleArray[0], value2 = doubleArray[0];
		int counter1 = 1, counter2 = 0, i = 0;
		boolean mode = false;

		for (i = 1; i < doubleArray.length; i++)
		{
			if (doubleArray[i] == value1) counter1++;

			else if (doubleArray[i] > value2)
			{
				counter2 = 1;
				value2 = doubleArray[i];
				if (counter1 == counter2) mode = false;
			}
			else if (doubleArray[i] == value2)
			{
				counter2++;

				if (counter2 > counter1)
				{
					mode = true;
					counter1++;
					counter2 = 0;
					value1 = value2;
				} // end if

				if (counter1 == counter2) mode = false;
			} // end else if
		} // end for

		if (mode == false) IO.outputStringAnswer("none"); // no mode
		else IO.outputDoubleAnswer(value1);
	} // end mode method

} // end Averages class
