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
		
		popCard();
		System.out.println(playercard);
		int cardSize = playercard.size();
		
		for (int i = 0; i < cardSize; i++) {
			System.out.println(playercard.remove(0));
		}
		
	}

	private static void popCard() {
		playercard.add(Deck.remove(0));

	}

}
