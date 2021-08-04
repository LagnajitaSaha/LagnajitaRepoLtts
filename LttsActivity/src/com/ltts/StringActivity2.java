package com.ltts;

import java.util.Scanner;

public class StringActivity2 {

	public static void main(String[] args) {
		String P1="";
		String P2="";
		String P1_lastname="";
		String P2_lastname="";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Player Name....");
		P1=sc.nextLine();
		System.out.println("Enter the Second Player Name......");
		P2=sc.nextLine();
		
		String[] arr=P1.split(" ");
		P1_lastname=arr[1];
		
		String[] arr2=P2.split(" ");
		P2_lastname=arr2[1];
		if(P1_lastname.equalsIgnoreCase(P2_lastname))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
	}

}
