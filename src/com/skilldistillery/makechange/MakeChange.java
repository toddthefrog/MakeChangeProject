package com.skilldistillery.makechange;

public class MakeChange {

	public double itemPrice;
	public double amountGiven;
	public double changeReturned;
	public String dollarsAndCents;

	public void haveEnough() {
		// calculate change
		if (amountGiven == itemPrice) {
			changeReturned = 0;
			System.out.println("You have paid the exact amount.\n");
		}
		if (amountGiven > itemPrice) {
			changeReturned = amountGiven - itemPrice;
			System.out.printf("You need $%.2f in change.\n", changeReturned);
		}

		//assign bill and coin placeholders
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;

		//trouble with pennies rounding
		//multiplying * 100 fixed this problem
		double a = changeReturned * 100;
		
		while (a >= 2000) {
			a = a - 2000;
			twenty++;
		}
		while (a >= 1000) {
			a = a - 1000;
			ten++;
		}
		while (a >= 500) {
			a = a - 500;
			five++;
		}
		while (a >= 100) {
			a = a - 100;
			one++;
		}
		while (a >= 25) {
			a = a - 25;
			quarter++;
		}
		while (a >= 10) {
			a = a - 10;
			dime++;
		}
		while (a >= 5) {
			a = a - 5;
			nickel++;
		}
		while (a > 0) {
			a--;
			penny++;
		}
		
		// check if the customer has paid enough
		// if they have print dollar and bill count
		// if they're short tell them
		if (amountGiven < itemPrice) {
			changeReturned = itemPrice - amountGiven;
			System.out.printf("You are short $%.2f\n", changeReturned);
		} else {
			System.out.println(twenty + " twenty(s) " + ten + " ten(s) " + five + " five(s) " + one + " one(s) " + quarter
					+ " quarter(s) " + dime + " dime(s) " + nickel + " nickel(s) " + penny + " penny(s)");
		}

	}

}
