package hijava.blackjack;

import java.util.ArrayList;
import java.util.List;


public class Card {
	
	public static void main(String[] args ) {
	
	Card card = new Card();
	System.out.println(card.cardlist);
	
	}

	private List<String> cardlist;

	public Card() {
		
		List<String> card = new ArrayList<>();
		
		makeCard(card, "heart");
		makeCard(card, "diamond");
		makeCard(card, "spade");
		makeCard(card, "clover");

		this.cardlist = card;
	}

	public List<String> getCardlist() {
		return cardlist;
	}

	private static void makeCard(List<String> cardlist, String p) {
		String pattern = p;
		
		String[] alphabet = {"A","J","k","Q"};
		
		for (int i = 2; i <= 10 ; i++ ) {
			String strnum = Integer.toString(i) ;
			String a = pattern +  strnum ;
			cardlist.add(a);
		}
		
		for (int i = 0 ; i < alphabet.length; i++) {
			String a = pattern + alphabet[i];
			cardlist.add(a);
		}
	}
}
