package WarCardGame;

import java.util.LinkedList;

public class Player {
	String name;
	int playerCount;
	LinkedList<Card> playerDeck;
	
	public Player(String name) {
		this.name = name;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public LinkedList<Card> getPlayerDeck() {
		return playerDeck;
	}

	public void setPlayerDeck(LinkedList<Card> playerDeck) {
		this.playerDeck = playerDeck;
	}
}
