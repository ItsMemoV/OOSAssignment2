package WarCardGame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck{
	private LinkedList<Card> deck;
	
	public Deck() {
		createDeck();
		shuffleDeck();
	}
	
	public void createDeck(){		
		for(int x=0; x<4; x++) {
			for(int y=2; y<15; y++) {
				deck.add(new Card(x, y));
			}
		}
	}
	
	public LinkedList<Card> getDeck(){
		return deck;
	}
	
	public void shuffleDeck() {
    	Collections.shuffle(deck, new Random());
	}
}