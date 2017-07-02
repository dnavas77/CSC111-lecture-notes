class lect_06 {
	// main
	public static void main (String[] args) {
		//calculate length of a day.
		System.out.println("Enter hours sunrise");
		int hsr = IO.readInt();

		System.out.println("Enter min sunrise");
		int msr = IO.readInt();

		if (hsr < 0 || hsr >= 24 || msr < 0 || msr >= 60) {
			return;
		}

		System.out.println("Enter hours sunset");
		int hss = IO.readInt();

		System.out.println("Enter min sunset");
		int mss = IO.readInt();

		if (hss < 0 || hss >= 24 || mss < 0 || mss >=60){
			return;
		}

		int tss = hss*60 + mss;
		int tsr = hsr*60 + msr;

		if (tss <= tsr) return;

		int lod = tss - tsr;
		int hlod = lod / 60;
		int mlod = lod % 60;

		System.out.println("Length of day: " +hlod+ " hours " +mlod+ "minutes");

		// Given lenght of 3 sides of polygon, can sides come together and form a triangle?
		// TODO in class
		System.out.println("Enter side 1:");
		double s1 = IO.readDouble();

		System.out.println("Enter side 2:");
		double s1 = IO.readDouble();

		System.out.println("Enter side 3:");
		double s1 = IO.readDouble();

		if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
			System.out.println("Positive sides only");
			return;
		}

		if (s1 >= s2+s3 || s2 >= s1+s3 || s3 >= s1+s2){
			System.out.println("Not a triangle!");
			return;
		}

		if (s1 > s1 && s1 > s3) {
			// s1 is largest side.
			if (s1*s1 == s2*s2+s3+s3) {
				// s1 is hypotenous and is a right triangle.
				System.out.println("It is a right triangle, Hyp = "+s1);
			} else {
				// it's a triangle but not a right one.
				System.out.println("Not a right triangle.");
			}
		} else if ( s2 > s1 && s2 > s3){
			// s2 is largest side.
			if (s2*s2 == s1*s1+s3+s3) {
				// s1 is hypotenous and is a right triangle.
				System.out.println("It is a right triangle, Hyp = "+s2);
			} else {
				// it's a triangle but not a right one.
				System.out.println("Not a right triangle.");
			}
		} else {
			if (s3*s3 == s1*s1+s2+s2) {
				// s1 is hypotenous and is a right triangle.
				System.out.println("It is a right triangle, Hyp = "+s3);
			} else {
				// it's a triangle but not a right one.
				System.out.println("Not a right triangle.");
			}
		}

	}
}