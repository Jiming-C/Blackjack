
public class Driver {

	public static void main(String[] args) {
		ComputerStratTester();
	}
	
	public static void ComputerStratTester() {
		System.out.println("- - - - - - - - - - -");
        BlackjackStrategy strat = new MySimpleStrategy();
		ComputerBlackjackPlayer test = new ComputerBlackjackPlayer(strat);
		//dealer
		BlackjackHand dealer = new BlackjackHand();
        PlayingCard card = new PlayingCard(1, 5);
		dealer.addCard(card);
		card = new PlayingCard(1, 6);
		dealer.addCard(card);
		//player
		BlackjackHand player = new BlackjackHand();
        card = new PlayingCard(1, PlayingCard.ACE);
		player.addCard(card);
        card = new PlayingCard(1, 4);
        player.addCard(card);
		
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		System.out.println("- - - - - - - - - - -");
		test = new ComputerBlackjackPlayer(strat);
		//dealer
		dealer = new BlackjackHand();
        card = new PlayingCard(1, 5);
		dealer.addCard(card);
		card = new PlayingCard(1, 6);
		dealer.addCard(card);
		//player
		player = new BlackjackHand();
        card = new PlayingCard(1, 10);
		player.addCard(card);
        card = new PlayingCard(1, 5);
        player.addCard(card);
	
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		System.out.println("- - - - - - - - - - -");
		test = new ComputerBlackjackPlayer(strat);
		//dealer
		dealer = new BlackjackHand();
        card = new PlayingCard(1, 5);
		dealer.addCard(card);
		card = new PlayingCard(1, 5);
		dealer.addCard(card);
		//player
		player = new BlackjackHand();
        card = new PlayingCard(1, 6);
		player.addCard(card);
        card = new PlayingCard(1, 5);
        player.addCard(card);
	
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		System.out.println("- - - - - - - - - - -");
		test = new ComputerBlackjackPlayer(strat);
		//dealer
		dealer = new BlackjackHand();
        card = new PlayingCard(1, 5);
		dealer.addCard(card);
		card = new PlayingCard(1, 2);
		dealer.addCard(card);
		//player
		player = new BlackjackHand();
        card = new PlayingCard(1, 5);
		player.addCard(card);
        card = new PlayingCard(1, 5);
        player.addCard(card);
        card = new PlayingCard(1, 7);
        player.addCard(card);
	
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		System.out.println("- - - - - - - - - - -");
		test = new ComputerBlackjackPlayer(strat);
		//dealer
		dealer = new BlackjackHand();
        card = new PlayingCard(1, 6);
		dealer.addCard(card);

		//player
		player = new BlackjackHand();
        card = new PlayingCard(1, 5);
		player.addCard(card);
        card = new PlayingCard(1, 5);
        player.addCard(card);
        card = new PlayingCard(1, 6);
        player.addCard(card);
	
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		System.out.println("- - - - - - - - - - -");
		test = new ComputerBlackjackPlayer(strat);
		//dealer
		dealer = new BlackjackHand();
        card = new PlayingCard(1, 2);
		dealer.addCard(card);

		//player
		player = new BlackjackHand();
        card = new PlayingCard(1, PlayingCard.ACE);
        player.addCard(card);
        card = new PlayingCard(1, 6);
        player.addCard(card);
	
        System.out.println("DealerValue: " + dealer.handValue());
        System.out.println("HandValue: " + player.handValue());
        System.out.println("Hand Soft: " + player.soft());
		System.out.println("Hit Return: " + test.hit(dealer, player));
		
		//1000 games
		System.out.println("- - - - - - - - - - - - - ");
		BlackjackDealer game = new BlackjackDealer();
		ComputerBlackjackPlayer player2 = new ComputerBlackjackPlayer(strat);
		
		System.out.println("SCORE: " + game.playBlackjack(player2, 100000));
		
	}
	
	public static void BlackjackDealerTester() {
		BlackjackDealer game = new BlackjackDealer();
		HumanBlackjackPlayer player = new HumanBlackjackPlayer();
		
		System.out.println("SCORE: " + game.playBlackjack(player, 6));
		
	}
	
	public static void BlackjackPlayerTester() {
		BlackjackPlayer test = new BlackjackPlayer();
		//hands
		BlackjackHand dealer = new BlackjackHand();
		dealer.addCard();
		dealer.addCard();
		BlackjackHand player = new BlackjackHand();
		player.addCard();
		//hit method
		System.out.print(test.hit(dealer, player));
	}
	
	public static void BlackjackHandTester() {
		System.out.println("-------------------------------");
		System.out.println("Jack Hand");
		BlackjackHand test = new BlackjackHand();
		PlayingCard card = new PlayingCard(1, 11);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Queen Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 12);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("King Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 13);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("2x Aces Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 1);
		test.addCard(card);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Ace Card Hand- Over 21");
		test = new BlackjackHand();
		card = new PlayingCard(1, 10);
		test.addCard(card);
		card = new PlayingCard(1, 2);
		test.addCard(card);
		card = new PlayingCard(1, 1);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Ace Card Hand- Under 21");
		test = new BlackjackHand();
		card = new PlayingCard(1, 9);
		test.addCard(card);
		card = new PlayingCard(1, 1);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("5+ Cards");
		test = new BlackjackHand();
		card = new PlayingCard(1, 2);
		test.addCard(card);
		test.addCard(card);
		test.addCard(card);
		test.addCard(card);
		test.addCard(card);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("BlackJack Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 10);
		test.addCard(card);
		card = new PlayingCard(1, 1);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Hard Val Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 1);
		test.addCard(card);
		card = new PlayingCard(1, 6);
		test.addCard(card);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Soft Val Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 1);
		test.addCard(card);
		card = new PlayingCard(1, 4);
		test.addCard(card);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Hard Val Hand - Ace Last");
		test = new BlackjackHand();
		card = new PlayingCard(1, 6);
		test.addCard(card);
		test.addCard(card);
		card = new PlayingCard(1, 1);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("Soft Val Hand - Ace Last");
		test = new BlackjackHand();
		card = new PlayingCard(1, 8);
		test.addCard(card);
		card = new PlayingCard(1, 1);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("2x Small Cards Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 4);
		test.addCard(card);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("ace, face, 2 Hand");
		test = new BlackjackHand();
		card = new PlayingCard(1, 1);
		test.addCard(card);
		card = new PlayingCard(1, 5);
		test.addCard(card);
		card = new PlayingCard(1, 2);
		test.addCard(card);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Hand Value: " + test.handValue());
		System.out.println("Print Method: ");
		test.print();
		
	}
	
	public static void HandTester() {
		System.out.println("-------------------------------");
		System.out.println("Empty Hand");
		Hand test = new Hand(0);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("Print Method: ");
		test.print();
		
		
		System.out.println("-------------------------------");
		System.out.println("1 Card Hand");
		test = new Hand(1);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("First Card: " + test.nthCard(0));
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("2 Card Hand");
		test = new Hand(2);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("First Card: " + test.nthCard(0));
		System.out.println("Last Card: " + test.nthCard(1));
		System.out.println("Print Method: ");
		test.print();
		
		System.out.println("-------------------------------");
		System.out.println("5 Card Hand");
		test = new Hand(5);
		System.out.println("Number of Cards: " + test.numberOfCards());
		System.out.println("First Card: " + test.nthCard(0));
		System.out.println("Middle Card: " + test.nthCard(2));
		System.out.println("Last Card: " + test.nthCard(4));
		System.out.println("Print Method: ");
		test.print();
		
	}
	
	
	public static void PlayingCardTester() {
		//Two Random Cards
		PlayingCard test = new PlayingCard();
		prntInfo(test);

		PlayingCard test2 = new PlayingCard();
		prntInfo(test2);
		
		//Two Manual Cards
		test.setRandom(false);
		test2.setRandom(false);
		
		test = new PlayingCard();
		prntInfo(test);
		
		test2 = new PlayingCard();
		prntInfo(test2);
		
		//Two Random Cards
		test.setRandom(true);
		test2.setRandom(true);
		
		test = new PlayingCard();
		prntInfo(test);
		
		test2 = new PlayingCard();
		prntInfo(test2);
		
		//13 Manual Cards
		test = new PlayingCard(PlayingCard.HEARTS, PlayingCard.ACE);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.SPADES, 2);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.CLUBS, 3);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.DIAMONDS, 4);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.HEARTS, 5);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.SPADES, 6);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.CLUBS, 7);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.DIAMONDS, 8);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.HEARTS, 9);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.SPADES, 10);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.CLUBS, PlayingCard.JACK);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.DIAMONDS, PlayingCard.QUEEN);
		prntInfo(test);
		test = new PlayingCard(PlayingCard.HEARTS, PlayingCard.KING);
		prntInfo(test);
	}
	
	public static void prntInfo(PlayingCard card) {
		System.out.println("Suit: " + card.getSuit());
		System.out.println("Value: " + card.getValue());
		System.out.println("Name: " + card);
		System.out.println("-------------------------------");
	}

}
