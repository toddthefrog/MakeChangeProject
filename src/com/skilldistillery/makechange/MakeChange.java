package com.skilldistillery.makechange;

public class MakeChange {

	public double itemPrice;
	public double amountGiven;
	public double changeReturned;

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
}
