
public class MySimpleStrategy extends BlackjackStrategy {
	public boolean hit(int handValue, int dealerHandValue, boolean soft) {
		boolean hit = false;
        if (dealerHandValue == 11  && handValue < 21){
            hit = true;
        }

        if (handValue < 17){
            hit = true;
        }

        if (soft){
            hit = true;
        }
        
        return hit;
	}
}
