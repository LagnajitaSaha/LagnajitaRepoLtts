package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_of_players;
		Scanner sc =new Scanner(System.in);
		String name;
		String skill;
		int skillno;
		ArrayList<Player_Comparator> alist=new ArrayList<>();
		System.out.println("Please provide the number of players to be registered");
		no_of_players=Integer.parseInt(sc.nextLine());
		for (int i=0;i<no_of_players;i++)
		{
			System.out.println("Please enter player name");
			
			name=sc.nextLine();
			
			System.out.println("Please select the skill of the player\r\n"
					+ "1.All Rounder\r\n"
					+ "2.Batsman\r\n"
					+ "3.Bowler\r\n"
					+ "");
			
			skillno=Integer.parseInt(sc.nextLine());
			if(skillno==1)
				skill="All Rounder";
			else if(skillno==2)
				skill="Batsman";
			else
				skill="Bowler";
			Player_Comparator obj= new Player_Comparator(name,skill);
			alist.add(obj);
			
		}
		
		
		Collections.sort(alist, Comparator.comparing(Player_Comparator::getSkill)
	            .thenComparing(Player_Comparator::getName));

	
	System.out.println("Player Details");
	Stream<Player_Comparator> playerlist=alist.stream();
	
	playerlist.forEach(
			Player_Comparator ->System.out.println("Player :"+Player_Comparator.getName()+" Skill  :"+Player_Comparator.getSkill())	);
	
	
	}
}
