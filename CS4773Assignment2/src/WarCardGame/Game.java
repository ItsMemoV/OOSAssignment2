package WarCardGame;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
    public static void main(String[] args) {
    	Deck deck = new Deck();
    	List<Player> players = new ArrayList<Player>();
    	Player Bob = new Player("Bob");
    	Player Sue = new Player("Sue");
    	players.add(Bob);
    	players.add(Sue);
    	players.get(0).setPlayerDeck(deck.getDeck());
    	players.get(1).setPlayerDeck(deck.getDeck());
        while(true){
            BottomRound round = new BottomRound(players);
            Winner winner = new Winner();
            players = round.getPlayers();
            if(winner.determineWinner(players.get(0), players.get(1)) == 1)
            	break;
        }  
    }
}
