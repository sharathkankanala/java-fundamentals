package com.codegnan.inheritance;

public class PremiumCustomer extends Customer {
	public PremiumCustomer(int id,int points) {
		super.setCustomerID(id);
		super.setPoints(points);
	}
	//method1 points*3 capped at 1000
	int computeReward1(int points) {
		int result=points*3;
		return Math.min(1000, result);
	}
	int computeReward2() {
		return  20;
	}
	int computeReward3(int points) {
		int result=points*3+20;
		return Math.min(1000, result);
	}
}
