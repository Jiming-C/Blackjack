
public class BlackjackDealer {
	
	public double playBlackjack(BlackjackPlayer player, int numGames) {
		boolean over = false;
		double score = 0.0;
		double dealerWins = 0;
		double playerWins = 0;
		
		for (int i = 0; i < numGames; i++) {
			over = false;
			BlackjackHand dealerHand = new BlackjackHand(true);
			BlackjackHand playerHand = new BlackjackHand(false);
			
			while (!over) {
				if (player.hit(dealerHand, playerHand)) {
					playerHand.addCard();
					if (playerHand.handValue() > 21) {
						player.playerBusts(playerHand);
						dealerWins ++;
						over = true;
					}
				} else {
					while (dealerHand.handValue() < 17) {
						dealerHand.addCard();
						player.dealerHit(dealerHand);
						if (dealerHand.handValue() > 21) {
							player.dealerBusts(dealerHand);
							playerWins ++;
							score += 1;
							over = true;
						}
					}
					
					if (dealerHand.handValue() == playerHand.handValue()){
						player.playerTies(playerHand, dealerHand);
						score += 0.5;
						over = true;
					}
					
//					if (playerHand.handValue() == 21) {
//						player.playerWins(playerHand, dealerHand);
//						playerWins ++;
//						score += 1;
//						over = true;
//					}
					
//					if (playerHand.handValue() > 21) {
//						player.playerBusts(playerHand);
//						over = true;
//					}
					
//					if (dealerHand.handValue() > 21) {
//						player.dealerBusts(dealerHand);
//						score += 1;
//						over = true;
//					}
					
					if ((playerHand.handValue() > dealerHand.handValue()) &&
						(playerHand.handValue() < 22)) {
						player.playerWins(playerHand, dealerHand);
						playerWins ++;
						score += 1;
						over = true;
					} 
					
					if ((dealerHand.handValue() > playerHand.handValue()) &&
								(dealerHand.handValue() < 22)){
						player.dealerWins(dealerHand, playerHand);
						dealerWins ++;
						over = true;
					} 
					

				}
			}
		}
//		System.out.println("Average Dealer Wins: " + dealerWins/numGames);
//		System.out.println("Average Player Wins: " + playerWins/numGames);
		return score/numGames;
	}
}
