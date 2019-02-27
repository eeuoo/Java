package hijava.blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Deck {
	
	protected List<String> playercard = new ArrayList<>();
	protected int cardsum = 0;
	
	public List<String> getPlayercard() {
		return this.playercard;
	}
	
	protected void setPlayercard(List<String> d) {
		this.playercard = d;
	}

	public int getSum() {
		return this.cardsum;
	}
	
	protected void setSum(int i) {
		this.cardsum = i;
	}

	public void start(String who) {
		popCard();
		popCard();
		this.cardsum = 0;
		
		System.out.println(who + "의 현재 카드" + this.playercard);
		
		getSum(this.cardsum, this.playercard);
		
	}
	
	protected void ing(int cardsum, List<String> playercard) {
		
		while (true) {
			if (this.cardsum < 17) {
				this.cardsum = 0;
				popCard();
				this.cardsum = getSum(this.cardsum, this.playercard);

			} else if (this.cardsum >= 17) {
				System.out.println("딜러 카드 : " + this.playercard);
				System.out.println("딜러 최종 합계=" + this.cardsum);
				break;
			}
		}
	}
	
	
	protected void popCard() {
		this.playercard.add(Deck.remove(0));
	}

	
	protected int getSum(int cardsum, List<String> playercard) {
		for (Iterator<String> itr = this.playercard.iterator(); itr.hasNext();) {
			String cardnum = itr.next();
			cardnum = cardnum.substring(cardnum.length() - 1);

			if (cardnum.equals("0") || cardnum.equals("J") || cardnum.equals("Q") || cardnum.equals("K")) {
				cardnum = "10";
			} else if (cardnum.equals("A")) {
				if (this.cardsum <= 10) {
					cardnum = "11";
				} else {
					cardnum = "1";
				}
			}

			this.cardsum += Integer.parseInt(cardnum);

		}
		return this.cardsum;
	}


}
