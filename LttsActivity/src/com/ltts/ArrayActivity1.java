package com.ltts;

import java.util.Scanner;

public class ArrayActivity1 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array...");
		int size=sc.nextInt();
		if(size<0) {
			System.out.println("Invalid input...");
			System.exit(0);
					}
		int arr[]=new int[size];
		
		System.out.println("Enter"+size+"no of elements into the array..");
		
		for(int j=0;j<arr.length;j++)
		{
			
			arr[j]=sc.nextInt();
			if(arr[j]<0)
					{
				System.out.println("Invalid input...");
				System.exit(0);
						}
			
			
			
		}
		
		System.out.println("Enter the element that you want to Count the occurances...");
		
		int searchkey=sc.nextInt();
	int result=	findElementCount( size, arr, searchkey);
	System.out.println("THE FINAL COUNT OF THE SEARCHED ELEMENT... "+result);
		
		
	}
	
	
	private static int  findElementCount(int i,int arr[],int s)
	{
		int counter=0;
		
		for(int k=0;k<arr.length;k++)
		{
			
			if(arr[k]==s)
			{
				counter++;
			}
			
		}
	//System.out.println(counter);
		return counter;
		
	}
		


}
