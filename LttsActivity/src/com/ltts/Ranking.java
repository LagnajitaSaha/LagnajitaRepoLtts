package com.ltts;

public class Ranking implements Comparable<Ranking>  {
	
	private String name;
	private int score;
	public Ranking(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Ranking o) {
		
		if(this.score==o.score)  
			return 0;  
			else if(this.score>o.score)  
			return -1;  
			else  
			return 1;  
	}
	
	

}
