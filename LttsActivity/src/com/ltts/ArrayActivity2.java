package com.ltts;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayActivity2 {
	
	static int result[]= {};

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array...");
		int size =sc.nextInt();
		if(size<0) {
			System.out.println("Invalid array size...");
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
		
		System.out.println("Enter qualified Score...");
		
		int score=sc.nextInt();
			if(score<0) {
			System.out.println("Invalid score...");
			System.exit(0);
					}
			
			findCricketerId(arr,size,score);
			System.out.print("the qualified criketer ids.....");
			for (int x=0;x<result.length;x++)
			{
				
				System.out.print(result[x]+", ");
			}

			
	}
			
			public static void findCricketerId(int arr[], int size, int score) 
			{
			
				ArrayList<Integer>alist=new ArrayList<>();
				for(int k=0;k<arr.length;k++)
				{
					
						if(arr[k]>score)
						{
							
							alist.add(arr[k-1]);
							
						
						}
						
						
					
				}
				
				result = new int[alist.size()];
			    for (int i=0; i < result.length; i++)
			    {
			        result[i] = alist.get(i).intValue();
			    }
			    
			    
				
			
				
			}


	
	
	
}
