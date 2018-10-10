package WarCardGame;

public class Card {
	private int rank;
	private int suit;
	
	public Card(int suit, int rank){
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getCard(){
		return rank; 
	}
	
	public void setCard(int rank){
		this.rank = rank;
    }
	
	@Override
	public String toString(){
		StringBuilder displayCard = new StringBuilder();
		switch(rank){
	        case 11:
	            displayCard.append("JACK");
	            break;
	        case 12:
	            displayCard.append("QUEEN");
	            break;
	        case 13:
	            displayCard.append("KING");
	            break;
	        case 14:
	            displayCard.append("ACE");
	            break;            
	        default:
	            displayCard.append(rank);
	            break;
		}
	    displayCard.append(" of ");
	    switch(suit){
	        case 0:
	            displayCard.append("SPADES");
	            break;
	        case 1:
	            displayCard.append("HEARTS");
	            break;
	        case 2:
	            displayCard.append("CLUBS");
	            break;
	        case 3:
	            displayCard.append("DIAMONDS");
	            break;
	        default:
	            break;
	    }
	    return displayCard.toString();
	}
}