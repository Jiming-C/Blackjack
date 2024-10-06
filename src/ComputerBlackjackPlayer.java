
class ComputerBlackjackPlayer extends BlackjackPlayer {
	
    private BlackjackStrategy strategy;
    
    ComputerBlackjackPlayer(BlackjackStrategy theStrategy){
        strategy = theStrategy;
    }
        
    public boolean hit (BlackjackHand opponentHand, BlackjackHand playerHand){
        return strategy.hit(playerHand.handValue(), opponentHand.handValue(), playerHand.soft());
    }

}
