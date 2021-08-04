package com.ltts;

import java.util.Scanner;

public class Employee1Main {

	public static void main(String[] args) {
		 String name="";
		 String address="";
		 String mobile="";
		 String expression="";
		Employee obj = new Employee();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name::");
		name=sc.nextLine();
		System.out.println("Enter Address::");
		address=sc.nextLine();
		System.out.println("Enter Mobile::");
		mobile=sc.nextLine();
		
		obj.setName(name);
		obj.setAddress(address);
		obj.setMobile(mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name: "+obj.getName());
		System.out.println("Address:"+obj.getAddress());
		System.out.println("Mobile:"+obj.getMobile());
		
		System.out.println("Verify and Update the details:");
		/*
		 * System.out.println("Menu"); System.out.println("1.	Update Employee name");
		 * System.out.println("2.	Update Employee Address");
		 * System.out.println("3.	Update Employee mobile");
		 * System.out.println("4.	All information correct/Exit");
		 */
		boolean loop = true;
		
		while(loop) {
			System.out.println("Menu");
			System.out.println("1.	Update Employee name");
			System.out.println("2.	Update Employee Address");
			System.out.println("3.	Update Employee mobile");
			System.out.println("4.	All information correct/Exit");
		switch(sc.nextLine())
		{
		case "1" :
			System.out.println("Current name is: "+obj.getName());
			System.out.println("Enter the name: ");
			name=sc.nextLine();
			obj.setName(name);
			System.out.println("Name updated sucessfully.. ");
			//input = true;
			break;
			
		case "2" :
			System.out.println("Current address is: "+obj.getAddress());
			System.out.println("Enter the address: ");
			address=sc.nextLine();
			obj.setAddress(address);
			System.out.println("Address updated sucessfully.. ");
			
			
			//input = true;
			
			break;
			
		case "3":
			System.out.println("Current mobile number is: "+obj.getMobile());
			System.out.println("Enter the Mobile number: ");
			mobile=sc.nextLine();
			obj.setMobile(mobile);
			System.out.println("Mobile Number updated sucessfully.. ");
			//input = true;
			break;
		case "4":
			System.out.println("The details are:");
			System.out.println("Name: "+obj.getName());
			System.out.println("Address:"+obj.getAddress());
			System.out.println("Mobile:"+obj.getMobile());
			 loop=false;
			break;
			
		
		  default: 
			  
			  loop=false;
		 
		}
		
			
		
		}
		

	}

}
