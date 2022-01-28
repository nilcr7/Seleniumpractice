package Systemclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//Object creation of Scanner class
		Scanner scnRef=new Scanner(System.in);		
//		int age=10;
//		double salary=2566.36;
//		String name="Pune";
		int age;
		double salary;
		String name;
		boolean valid;		
		/*Initialization of variable using Scanner class*/
		System.out.println("Get age value from console");
		age=scnRef.nextInt();		
		System.out.println("Get salary value from console");
		salary=scnRef.nextDouble();				
		System.out.println("Get name value from console");
		name=scnRef.next();		
		System.out.println("Get valid value from console");
		valid=scnRef.nextBoolean();	
		
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("valid: "+valid);
		System.out.println("*****************************************");
	}

}
