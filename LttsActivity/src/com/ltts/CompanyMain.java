package com.ltts;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		
		String name;
		String employees;
		String teamlead;
		ArrayList<String> alist=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the company name:");
		name=sc.nextLine();
		System.out.println("Enter the employees:");
		employees=sc.nextLine();
		System.out.println("Enter TeamLead:");
		teamlead=sc.nextLine();
		Company obj =new Company();
		String arr[]=employees.split(",");
		
		for(int i=0;i<arr.length;i++)
		{
			alist.add(arr[i]);
			
		}
		
		if(alist.contains(teamlead))
		{
			
			obj.setName(name);
			obj.setEmployees(employees);
			obj.setTeamlead(teamlead);
			
			System.out.println("Deatiled Output...");
			System.out.println("Name:"+obj.getName());
			System.out.println("Emploees:"+obj.getEmployees());
			System.out.println("Lead:"+obj.getTeamlead());
			
			
		}
		else
			System.out.println("Invalid input.");
		

	}

}
