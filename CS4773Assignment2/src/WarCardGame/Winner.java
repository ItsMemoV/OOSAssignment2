package WarCardGame;

public class Winner {
	public int determineWinner(Player p1, Player p2) {
		if((p2.getPlayerDeck().size() == 0 ) || 
				((p1.getPlayerCount() + p2.getPlayerCount()) >= 52 && 
				(p1.getPlayerDeck().size() > p2.getPlayerDeck().size()))){
            System.out.println("Game Over (" + (p1.getPlayerCount() + p2.getPlayerCount()) + " Total Rounds)\n"
            		+ p1.name + " wins the game");
            return 1;
        }
        else if((p1.getPlayerDeck().size() == 0) || 
        		((p1.getPlayerCount() + p2.getPlayerCount()) >= 52 && 
        		(p1.getPlayerDeck().size() < p2.getPlayerDeck().size()))){
            System.out.println("Game Over (" + (p1.getPlayerCount() + p2.getPlayerCount()) + " Total Rounds)\n"
            		+ p2.name + " wins the game");
            return 1;
        }
    	return 0;
    }
	
//	public  int determinePileWinner() {
//		if((BobDeck.size() == 0 || SueDeck.size() == 0) && BobWinPile.size() > SueWinPile.size()){
//			System.out.println("Game Over\nBob wins the game");
//            return 1;
//        }
//        else if((BobDeck.size() == 0 || SueDeck.size() == 0) && BobWinPile.size() < SueWinPile.size()){
//            System.out.println("Game Over\nSue wins the game");
//            return 1;
//        }
//    	return 0;
//    }
}
