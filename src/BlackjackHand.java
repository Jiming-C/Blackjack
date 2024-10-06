
public class BlackjackHand extends Hand {
	
	private int handValue;
	private boolean soft;
	
	BlackjackHand(boolean dealer) {
		super(1);
		if (!dealer) {
			this.addCard();
		}
	}
	
	BlackjackHand(){
		super(0);
	}
	
	private void computeValue() {
		handValue = 0;
		boolean aces = false;
		soft = false;
		
		for (int i = 0; i < this.numberOfCards(); i++) {
			var card = this.nthCard(i);
			if ( 
				(card.getValue() == PlayingCard.JACK) ||
				(card.getValue() == PlayingCard.QUEEN) ||
				(card.getValue() == PlayingCard.KING)) {
				handValue += 10;
			} else {
				handValue += card.getValue();
			}
			
			if (card.getValue() == PlayingCard.ACE) {
				aces = true;
			}		
		}	
//		for (PlayingCard card : this.hand) {
//			if ((card.getValue() == PlayingCard.JACK)||
//				(card.getValue() == PlayingCard.QUEEN)||
//				(card.getValue() == PlayingCard.KING)) {
//				handValue += 10;
//			} else {
//				handValue += card.getValue();
//			}
//		
//			if (card.getValue() == PlayingCard.ACE) {
//				aces = true;
//			}
//		}
		if ((aces) && (handValue < 12)) {
			handValue += 10;
			soft = true;
		}
	}
	
	public void clearHand() {
		
	}
	
	public void addCard() {
		super.addCard();
		computeValue();
	}
	
	public void addCard(PlayingCard card) {
		super.addCard(card);
		computeValue();
	}
	
	public int handValue() {
		return handValue;
	}
	
	public boolean soft() {
		return soft;
	}
	
	
	
	





}
