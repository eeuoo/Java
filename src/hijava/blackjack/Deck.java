package hijava.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	static Card card = new Card();
	public static final List<String> Deck = card.getCardlist();
	public static List<String> playercard = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		popCard();
		System.out.println(playercard);
		popCard();
		System.out.println(playercard);
		
	}

	private static void popCard() {
		playercard.add(Deck.remove(0));
	}

}
