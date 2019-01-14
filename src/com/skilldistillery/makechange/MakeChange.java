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
		if (amountGiven < itemPrice) {
			changeReturned = itemPrice - amountGiven;
			System.out.printf("You are short $%.2f\n", changeReturned);
		}
	}
	
	public void calculateChange() {
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		while (changeReturned != 0) {
			
			if (changeReturned >= 20.00 ) {
				changeReturned = changeReturned - 20.00;
				twenty ++;
			}
			if (changeReturned >= 10.00 && changeReturned < 20.00) {
				changeReturned = changeReturned - 10.00;
				ten ++;
			}
			if (changeReturned >= 5.00 && changeReturned < 10.00) {
				changeReturned = changeReturned - 5.00;
				five ++;
			}
			if (changeReturned >= 1.00 && changeReturned < 5.00) {
				changeReturned = changeReturned - 1.00;
				one ++;
			}
		
		}
		
		dollarsAndCents = twenty + " twenty(s) " + ten + " ten(s) " + five + " five(s) " + one + "one(s)";
		
	}
	
}
