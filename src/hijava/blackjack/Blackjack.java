package hijava.blackjack;

import java.util.Collections;
import java.util.List;

public class Blackjack implements Deck {
	static Card card = new Card();
	

	public static void main(String[] args) {
//		List<String> Deck = card.getCardlist();
		Collections.shuffle(Deck);
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.start("딜러");
		player.start("나");
		
		player.ing( player.getPlayercard());
		dealer.ing( dealer.getPlayercard());
		
		int p = player.getSum();
		int d = dealer.getSum();
		
		whoiswinner(p, d);

	}

	public static void whoiswinner(int p, int d) {
		if (p < 21 && d < 21) { 
			if (p > d) {System.out.println("Win!");}
			else if(d > p) { System.out.println("Lose!");}
		}else if (p > 21) {
			if (d > 21) {System.out.println("Draw!");}
			else if(d == 21) {System.out.println("Lose!");}
			else {System.out.println("Lose!");}
		}else if (p==21){
			System.out.println("Win!");
		}else if (p < 21 && d > 21) {
			System.out.println("Win!");
		}else if (d==21) {
			if (p==21) {System.out.println("Draw!");}
			else {System.out.println("Lose!");}
		}
		
	}

}

