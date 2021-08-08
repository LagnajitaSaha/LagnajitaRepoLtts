package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team_Comparable {
	private String name;
	private List<Player> playerList;

	public Team_Comparable(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public void addPlayer(String playername) {
		playerList = new ArrayList<>();
		String arr[] = playername.split(",");
		for (int i = 0; i < arr.length; i++) {

			Player obj = new Player(arr[i]);
			playerList.add(obj);

		}

	}

}
