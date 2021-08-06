package com.ltts;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		int number_of_overs;
		int over_number;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs ");
		number_of_overs=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the number of runs for each over ");
		try {
		int arr[]=new int[number_of_overs];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
			
		}
		
		System.out.println("Enter the over number ");
		over_number=Integer.parseInt(sc.nextLine());
		
		System.out.println("Runs scored in this over : "+arr[over_number-1]);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
		
	}

}
