package com.ltts;

import java.util.Scanner;

public class StringActivity1 {

	public static void main(String[] args) {
		String F="";
		String S="";
		String output="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Name....");
		F=sc.nextLine();
		System.out.println("Enter the Second Name......");
		S=sc.nextLine();
		
		
		output=F.substring(0, 1).toUpperCase()+F.substring(1).toLowerCase()+S.toUpperCase();
		System.out.println("The output String..."+output);
		

	}

}
