package com.ltts;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		String name="";
		String address="";
		String mobile="";
		String details="";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the details:");
		details=sc.nextLine();
		
		String arr[]=details.split(",");
		name=arr[0];
		address=arr[1];
		mobile=arr[2];
		
		Customer obj=new Customer();
		obj.setName(name);
		obj.setAddress(address);
		obj.setMobile(mobile);
		
		System.out.println("Customer Deatils...");
		System.out.println("Name:"+obj.getName());
		System.out.println("Address:"+obj.getAddress());
		System.out.println("Mobile: "+obj.getMobile());
		

	}

}
