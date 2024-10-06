import java.util.ArrayList;

public class Hand {
	
	private ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
	
	Hand(int initialCards){
		for(int i = 0; i < initialCards; i++) {
			this.addCard();
		}
//	    if (initialCards == 0){
//	      hand.clear();
//	    }
	}
  
	public int numberOfCards(){
		return hand.size();
	}

	public PlayingCard nthCard(int n){
		//Avoids IndexOutOfBounds
		if (hand.size() < 1) {
			return null;
		} else {
			return hand.get(n);
		}
	}

	public void print(){
		//Print all cards at hand
		for (PlayingCard card : hand) {
			System.out.println(card);
		}
	}

	public void addCard(PlayingCard card){
		hand.add(card);
	}
	
	public void addCard(){
		addCard(new PlayingCard());
	}


	
	
}