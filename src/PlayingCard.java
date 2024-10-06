import java.util.*;

public class PlayingCard {
	private int suit;	//1 to 4
	private int value; 	//1 to 13
	
	//Values
	public final static int ACE = 1;
	public final static int KING = 13;
	public final static int QUEEN = 12;
	public final static int JACK = 11;
	
	//Suits
	public final static int HEARTS = 1;
	public final static int SPADES = 2;
	public final static int CLUBS = 3;
	public final static int DIAMONDS = 4;
	
	public static boolean random = true;
	
	PlayingCard(int suitVal, int valueVal){
		suit = suitVal;
		value = valueVal;
	}
	
	PlayingCard(){
		if (random) {
			suit = (int)(Math.random() * 4 + 1);
			value = (int)(Math.random() * 13 + 1);
		} else {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter suit value (1 - 4): ");
			String userInput = scan.nextLine();
			suit = Integer.parseInt(userInput);
			
			System.out.println("Please enter face value (1 - 13): ");
			userInput = scan.nextLine();
			value = Integer.parseInt(userInput);		
		}
	}
	
	public void setRandom(boolean value) {
		if (value) {
			random = true;
		} else {
			random = false;
		}
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String output = "";
		String suitOutput = "";
		String valueOutput = "";
		
		if (value == ACE) {
			valueOutput = "A";
		} else if (value == KING) {
			valueOutput = "K";
		} else if (value == QUEEN) {
			valueOutput = "Q";
		} else if (value == JACK) {
			valueOutput = "J";
		} else {
			valueOutput = String.valueOf(value);
		}
		
		if (suit == HEARTS) {
			suitOutput = "Hearts";
		} else if (suit == SPADES) {
			suitOutput = "Spades";
		} else if (suit == CLUBS) {
			suitOutput = "Clubs";
		} else if (suit == DIAMONDS) {
			suitOutput = "Diamonds";
		}
		
		output = (valueOutput + " of " + suitOutput);
		return output;
	}
}
