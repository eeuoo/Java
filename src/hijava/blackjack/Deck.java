package hijava.blackjack;

import java.util.List;

public interface Deck {
	
	static Card card = new Card();
	public static final List<String> Deck = card.getCardlist();

}
