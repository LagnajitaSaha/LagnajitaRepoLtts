package com.ltts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		int total_runs_scored;
		  int total_overs_faced;
		  float Run_rate;

		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total runs scored ");
		try {
			total_runs_scored = Integer.parseInt(obj.readLine());

			System.out.println("Enter the total overs faced ");
			total_overs_faced = Integer.parseInt(obj.readLine());
			if(total_overs_faced==0)
				Run_rate =total_runs_scored / total_overs_faced;
			else
			Run_rate =((float)total_runs_scored )/ total_overs_faced;
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Current Run Rate : " + df.format(Run_rate));
			
			
		} catch (Exception e) {
			System.out.println(e.getClass());
		}

	}

}
