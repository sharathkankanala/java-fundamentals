package com.codegnan.inheritance;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int points=sc.nextInt();
		int points1=sc.nextInt();
		int points2=sc.nextInt();
		PremiumCustomer pc=new PremiumCustomer(id,points);
		System.out.println(pc.computeReward1(points1));
		System.out.println(pc.computeReward2());
		System.out.println(pc.computeReward3(points2));
		System.out.println(pc.getCustomerID());
		System.out.println(pc.getPoints());
		sc.close();
	}

}
