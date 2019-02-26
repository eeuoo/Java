package hijava.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Flow {
	static Card card = new Card();
	public static final List<String> Deck = card.getCardlist();
	public static List<String> playercard = new ArrayList<>();

	public static void main(String[] args) {
		Collections.shuffle(Deck);

		popCard();
		popCard();
		int cardsum = 0;
		getSum(cardsum);
		System.out.println(playercard);

		while (true) {
			if (cardsum < 17) {
				cardsum = 0;
				popCard();
				System.out.println(playercard);
				cardsum = getSum(cardsum);
				System.out.println(cardsum);

			} else if (cardsum >= 17) {
				System.out.println("최종 합계=" + cardsum);
				break;
			}

		}

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

	private static void popCard() {
		playercard.add(Deck.remove(0));
	}

}
