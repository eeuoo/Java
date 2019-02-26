package hijava.blackjack;

import java.util.Collections;
import java.util.List;

public class Blackjack {
	static Card card = new Card();
	

	public static void main(String[] args) {
		List<String> Deck = card.getCardlist();
		Collections.shuffle(Deck);
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.start();
		player.start();
		
		dealer.ing();
		player.ing();
		
		int p = player.getResult();
		int d = dealer.getResult();
		
		whoiswinner(p, d);

	}

	private static void whoiswinner(int p, int d) {
		if (p == d) {
			System.out.println("draw!");
		}
		
	}

}

