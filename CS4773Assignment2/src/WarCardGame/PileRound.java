
package WarCardGame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PileRound {
	LinkedList<Card> p1WinPile = new LinkedList<Card>();
	LinkedList<Card> p2WinPile = new LinkedList<Card>();
	LinkedList<Card> p3WinPile = new LinkedList<Card>();
	List<Player> players = new ArrayList<Player>();
	Player p1;
	Player p2;
	Player p3;
	
	
	public PileRound(List<Player> players){
		this.players = players;
		p1 = players.get(0);
		p2 = players.get(1);
		if (players.size() == 2) {
			playTwoPlayerRound();
		}else if(players.size() == 3)
			p3 = players.get(2);
			playThreePlayerRound();
	}
	
	public void playTwoPlayerRound() {
		Card p1Card = p1.getPlayerDeck().pop();
		Card p2Card = p2.getPlayerDeck().pop();
        System.out.println(p1.name + " plays " + p1Card.toString() + " as up card");
        System.out.println(p2.name + " plays " + p2Card.toString() + " as up card");          

        if(p1Card.getCard() > p2Card.getCard()){
        	p1WinPile.addLast(p1Card);
        	p1WinPile.addLast(p2Card);
            System.out.println(p1.name + " wins the round");
            System.out.println("Score is " + p1.name + " " + p1WinPile.size() + 
            						  ", " + p2.name + " " + p2WinPile.size());
        }
        else if(p1Card.getCard() < p2Card.getCard()){ 
        	p2WinPile.addLast(p2Card);
        	p2WinPile.addLast(p1Card);
        	System.out.println(p2.name + " wins the round");
            System.out.println("Score is " + p1.name + " " + p1WinPile.size() + 
            						  ", " + p2.name + " " + p2WinPile.size());
        }
        else if(p1.getPlayerDeck().size() > 3 && p2.getPlayerDeck().size() > 3 ){
        	WarRound war = new WarRound(p1, p2 , p1Card, p2Card);
        	war.addWarCards();
        	war.determineWarRoundWinner();
        }
	}
	
	public void playThreePlayerRound() {
		
	}
	
	public List<Player> getPlayers() {
		players.set(0, p1);
		players.set(1, p2);
		try {
			players.set(2, p3);
		}catch (Exception e) {
			
		}
		return players;
	}
}
