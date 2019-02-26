package hijava.blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck {
	static Card card = new Card();
	public static final List<String> Deck = card.getCardlist();
	public static List<String> playercard = new ArrayList<>();

	public static void main(String[] args) {

		
		while (true) {
			popCard();
			popCard();
			

			int cardsum = 0;
			
			cardsum = getSum(cardsum);
			
			if (cardsum < 17) {
				System.out.println(playercard);
				cardsum = getSum(cardsum);
				System.out.println(cardsum);
				popCard();

			} else {
				System.out.println("else");
				System.out.println(playercard);
				break;
			}
		}

	}

	private static int getSum(int cardsum) {
		for (Iterator<String> itr = playercard.iterator(); itr.hasNext();) {

			String cardnum = itr.next();
			cardnum = cardnum.substring(cardnum.length() - 1);
			cardsum += Integer.parseInt(cardnum);

		}
		return cardsum;
	}

//	private static int getSum(int cardSize, int cardsum) {
//		for (int i = 0; i < cardSize; i++) {
//			String pickedcard = playercard.remove(0);
//
//			String cardnum = pickedcard.substring(pickedcard.length() - 1);
//
//			cardsum += Integer.parseInt(cardnum);
//
//			System.out.println(cardsum);
//
//		}
//		return cardsum;
//	}

	private static void popCard() {
		playercard.add(Deck.remove(0));
	}

}
