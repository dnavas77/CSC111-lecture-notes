class moneyChange {

	public static void main (String[] args) {

		double sales=0, amountPaid=0, change=0;
		int pennies=0, nickles=0, dimes=0, quarters=0, twentyBill=0, tenBill=0, fiveBill=0, oneBill=0;

		System.out.print("Enter sales: ");
		sales = IO.readDouble();

		System.out.print("Enter amount given: ");
		amountPaid = IO.readDouble();

		change = amountPaid - sales;

		// calculate how many $20 bills needed for change
		while ( (change - 20) > 0) {
			change = change - 20;
			twentyBill++;
		}

		// calculate how many $10 bills needed for change
		while ( (change - 10) > 0) {
			change = change - 10;
			tenBill++;
		}

		// calculate how many $5 bills needed for change
		while ( (change - 5) > 0) {
			change = change - 5;
			fiveBill++;
		}

		// calculate how many $1 bills needed for change
		while ( (change - 1) > 0) {
			change = change - 1;
			oneBill++;
		}

		// calculate how many quarters needed for change
		while ( (change - 0.25) > 0) {
			change = change - 0.25;
			quarters++;
		}

		// calculate how many dimes needed for change
		while ( (change - 0.10) > 0) {
			change = change - 0.10;
			dimes++;
		}

		// calculate how many nickles needed for change
		while ( (change - 0.05) > 0) {
			change = change - 0.05;
			nickles++;
		}

		// calculate how many pennies needed for change
		while ( (change - 0.01) >= 0) {
			// round decimals after pennies to get all pennies
			change = Math.round(change * 100.0) / 100.0;
			change = change - 0.01;
			pennies++;
		}

		// output change needed
		System.out.println();
		if (twentyBill > 0) System.out.println(twentyBill + "\t$20 dollar bill(s)");
		if (tenBill > 0) System.out.println(tenBill + "\t$10 dollar bill(s)");
		if (fiveBill > 0) System.out.println(fiveBill + "\t$5 dollar bill(s)");
		if (oneBill > 0) System.out.println(oneBill + "\t$1 dollar bill(s)");
		if (quarters > 0) System.out.println(quarters + "\tquarters(s)");
		if (dimes > 0) System.out.println(dimes + "\tdime(s)");
		if (nickles > 0) System.out.println(nickles + "\tnickle(s)");
		if (pennies > 0) System.out.println(pennies + "\tpennie(s)");

	} // end main method

} // end moneyChange Class
