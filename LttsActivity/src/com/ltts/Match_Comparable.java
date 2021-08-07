package com.ltts;

public class Match_Comparable implements Comparable<Match_Comparable> {

	private String matchDate;
	private String teamOne;
	private String teamTwo;

	public Match_Comparable(String matchDate, String teamOne, String teamTwo) {
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	@Override
	public int compareTo(Match_Comparable o) {

		return o.matchDate.compareTo(this.matchDate);

	}

}
