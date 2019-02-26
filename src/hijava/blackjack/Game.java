package hijava.blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Deck {
	
	private static List<String> playercard = new ArrayList<>();
	

	public static void start() {
		popCard();
		popCard();
		int cardsum = 0;
		
		System.out.println(playercard);
		
		getSum(cardsum);
		
	}
	
	private static void popCard() {
		playercard.add(Deck.remove(0));
	}

	private static int getSum(int cardsum) {
		for (Iterator<String> itr = playercard.iterator(); itr.hasNext();) {
			String cardnum = itr.next();
			cardnum = cardnum.substring(cardnum.length() - 1);

			if (cardnum.equals("0") || cardnum.equals("J") || cardnum.equals("Q") || cardnum.equals("K")) {
				cardnum = "10";
			} else if (cardnum.equals("A")) {
				if (cardsum <= 10) {
					cardnum = "11";
				} else {
					cardnum = "1";
				}
			}

			cardsum += Integer.parseInt(cardnum);

		}
		return cardsum;
	}

}
