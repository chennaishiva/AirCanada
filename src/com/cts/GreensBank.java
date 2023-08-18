package com.cts;

public class GreensBank extends Hdfcbank {

	@Override
	public void savingsAcc() {
		System.out.println("6%");
	}
	
	@Override
	public void currentAcc() {
		System.out.println("9%");
	}
	
	public void loan(String intrest) {
		System.out.println(intrest);
	}
	
	public static void main(String[] args) {
		GreensBank g = new GreensBank();
		g.savingsAcc();
		g.currentAcc();
		g.loan("10%");
	}
}
