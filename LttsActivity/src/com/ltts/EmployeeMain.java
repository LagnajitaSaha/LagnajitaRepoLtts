package com.ltts;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		String name="";
		String address="";
		String mobille="";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name of The Employee....");
		name=sc.nextLine();
		System.out.println("Enter the Address of The Employee ......");
		address=sc.nextLine();
		System.out.println("Enter the MobileNumber of The Employee ......");
		mobille=sc.nextLine();
		
		Employee obj =new Employee();
		obj.setName(name);
		obj.setAddress(address);
		obj.setMobile(mobille);
		
		System.out.println("Employee Details..");
		System.out.println("Name:"+obj.getName());
		System.out.println("Address:"+obj.getAddress());
		System.out.println("Mobile:"+obj.getMobile());
	}

}
