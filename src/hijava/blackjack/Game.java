package hijava.blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Deck {

	private List<String> playercard = new ArrayList<>();
	private int cardsum = 0;

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
		this.cardsum = 0;
		popCard();
		getSum(this.cardsum, this.playercard);
		popCard();
		getSum(this.cardsum, this.playercard);

		System.out.println(who + "의 현재 카드" + this.playercard);

		getSum(this.cardsum, this.playercard);

	}

	protected void ing(int cardsum, List<String> playercard) {

		while (true) {
			if (this.cardsum < 17) {
				popCard();
				getSum(this.cardsum, this.playercard);

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

	protected void getSum(int cardsum, List<String> playercard) {

		String num = this.playercard.get(this.playercard.size() - 1);

		num = num.substring(num.length() - 1);

		if (num.equals("0") || num.equals("J") || num.equals("Q") || num.equals("K")) {
			num = "10";
		} else if (num.equals("A")) {
			if (this.cardsum <= 10) {
				num = "11";
			} else {
				num = "1";
			}
		}

		this.cardsum += Integer.parseInt(num);
	}

}
