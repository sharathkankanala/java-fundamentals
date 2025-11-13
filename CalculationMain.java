package com.codegnan.inheritance;

import java.util.Scanner;

public class CalculationMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ClaculationMy cm=new ClaculationMy(a,b);
		System.out.println(cm.addition(a, b));
		System.out.println(cm.multiplication(a, b));
		sc.close();
	}
}
