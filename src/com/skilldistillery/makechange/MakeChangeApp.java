package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		MakeChange mc = new MakeChange();
		
		//ask for the price of the item
		System.out.println("Please enter the price in this format: 20.00");
		mc.itemPrice = kb.nextDouble();
		//ask for amount paid
		System.out.println("Please enter the amount paid in this format: 20.00");
		mc.amountGiven = kb.nextDouble();
		
		//check if amount given is enough to pay for the item
		//display if customer paid enough, exactly or too little
		//calculate how many bills and coins the customer needs
		mc.haveEnough();
		
		kb.close();
	}

}
