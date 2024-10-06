import java.util.Scanner;

public class HumanBlackjackPlayer extends BlackjackPlayer {
	public boolean hit (BlackjackHand dealerHand, BlackjackHand playerHand ) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("Player Hand: " + playerHand.handValue());
		playerHand.print();
		System.out.println("- - - - - - -");
		
		//asks player
		Scanner scan = new Scanner(System.in);
		String input = "";
		boolean validAns = false;
		boolean hit = false;
		
		while (!validAns) {
			System.out.println("Do you want to hit? (Y/N)");
			input = scan.nextLine();
			if (input.toLowerCase().equals("y")) {
				validAns = true;
				hit = true;
			} else if (input.toLowerCase().equals("n")) {
				validAns = true;
				hit = false;
			} else {
				System.out.println("Please enter a valid input");
			}
		}
		
		return hit;
	}
	
	public void dealerHit(BlackjackHand dealerHand) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("* Dealer Hit *");
		
	}
	
	public void playerBusts(BlackjackHand playerHand) {
		System.out.println("Player Hand: " + playerHand.handValue());
		playerHand.print();
		System.out.println("- Player Busted -");
		System.out.println("- - - - New Game - - - -");
	}
	
	public void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("Player Hand: " + playerHand.handValue());
		playerHand.print();
		System.out.println("- Tied w/Dealer -");
		System.out.println("- - - - New Game - - - -");
	}
	
	public void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("Player Hand: " + playerHand.handValue());
		playerHand.print();
		System.out.println("- Player Wins -");
		System.out.println("- - - - New Game - - - -");
	}
	
	public void dealerBusts(BlackjackHand dealerHand) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("- Dealer Bust -");
		System.out.println("- - - - New Game - - - -");
	}
	
	public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) {
		System.out.println("Dealer Hand: " + dealerHand.handValue());
		dealerHand.print();
		System.out.println("Player Hand: " + playerHand.handValue());
		playerHand.print();
		System.out.println("- Dealer Wins -");
		System.out.println("- - - - New Game - - - -");
	}

}
