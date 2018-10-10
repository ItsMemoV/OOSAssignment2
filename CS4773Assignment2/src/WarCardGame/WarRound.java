package WarCardGame;

import java.util.ArrayList;
import java.util.List;

public class WarRound {
	List<Card> p1WarCards = new ArrayList<Card>(); 
    List<Card> p2WarCards = new ArrayList<Card>();
    Player p1;
    Player p2;
    Card p1Card;
    Card p2Card;
    
	public WarRound(Player p1,Player p2, Card p1Card, Card p2Card) {
		System.out.println("War");
		this.p1 = p1;
		this.p2 = p2;
		this.p1Card = p1Card;
		this.p2Card = p2Card;
	}
	
	public void addWarCards() {
		p1WarCards.add(p1Card); 
		p2WarCards.add(p2Card);
        p1WarCards.add(p1.getPlayerDeck().pop());
        p2WarCards.add(p2.getPlayerDeck().pop());                  
        System.out.println("War card for " + p1.name + " is xx\nWar card for " + p2.name + " is xx");
        p1WarCards.add(p1.getPlayerDeck().pop()); 
        p2WarCards.add(p2.getPlayerDeck().pop());
	}
	
	public void determineWarRoundWinner() {
		if(p1WarCards.size() == 3 && p2WarCards.size() == 3){
            System.out.println("War card for " + p1.name + " is " + p1WarCards.get(2).toString());
            System.out.println("War card for " + p2.name + " is " + p2WarCards.get(2).toString());
            if(p1WarCards.get(1).getCard() > p2WarCards.get(1).getCard()){
            	p1.getPlayerDeck().addAll(p1WarCards);
            	p1.getPlayerDeck().addAll(p2WarCards);
            	p1.setPlayerCount(p1.getPlayerCount()+3);
                System.out.println(p1.name + " wins the war round");
            }
            else{
            	p2.getPlayerDeck().addAll(p2WarCards);
            	p2.getPlayerDeck().addAll(p1WarCards);
            	p2.setPlayerCount(p2.getPlayerCount()+3);
                System.out.println(p2.name + " wins the war round");
            }
        }
	}
}