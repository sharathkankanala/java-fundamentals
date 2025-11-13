package com.codegnan.inheritance;

import java.util.Scanner;

public class EmployeeInfo extends Employee {
	double salaryPerYear;
	public EmployeeInfo() {
		super("","",0);
	}
	public void inputEmployeeDeatails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee name: ");
		emp_name=sc.nextLine();
		System.out.print("Enter employee designation: ");
		designation=sc.nextLine();
		System.out.print("Enter year of experience: ");
		experience=sc.nextInt();
		System.out.print("Enter salary per year: ");
		salaryPerYear=sc.nextDouble();
		sc.close();
	}public void displayEmployeeInfo() {
		System.out.println("Employee name: "+emp_name.toUpperCase());
		System.out.println("Designation: "+ designation);
		System.out.println("Year of Experience : "+experience);
		
	}public void claculate() {
		double salary=salaryPerYear*experience;
		System.out.println("Salary: "+salary);
	}
	
}
