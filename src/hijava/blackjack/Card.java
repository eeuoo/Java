package hijava.blackjack;

import java.util.ArrayList;
import java.util.List;


public class Card {
	
	public static void main(String[] args ) {
	
	List<String> cardlist = new ArrayList<>();
	
	makeCard(cardlist, "heart");
	makeCard(cardlist, "diamond");
	makeCard(cardlist, "spade");
	makeCard(cardlist, "clover");
	
	System.out.println(cardlist);
	
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
