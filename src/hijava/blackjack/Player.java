package hijava.blackjack;

import java.util.Iterator;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends Game {

	@Override
	public void start(String who) {
		popCard();
		popCard();

		System.out.println(who + "의 현재 카드" + playercard);

		getSum(cardsum, playercard);

	}

	@Override
	public int getSum(int cardsum, List<String> playercard) {
		for (Iterator<String> itr = playercard.iterator(); itr.hasNext();) {
			String cardnum = itr.next();
			cardnum = cardnum.substring(cardnum.length() - 1);

			if (cardnum.equals("0") || cardnum.equals("J") || cardnum.equals("Q") || cardnum.equals("K")) {
				cardnum = "10";
			} else if (cardnum.equals("A")) {
				System.out.println(playercard);
				System.out.println("a value ? 11 > 1, 1 > 1");
				Scanner scan = new Scanner(System.in);
				String aValue = scan.nextLine();

				// TODO 잘못 입력받았을 때 처리
				if (aValue.equals("11")) {
					cardnum = "11";
				} else if (aValue.equals("1")) {
					cardnum = "1";
				}
			}

			cardsum += Integer.parseInt(cardnum);

		}
		return cardsum;
	}

	@Override
	public void ing(int cardsum, List<String> playercard) {

		while (cardsum <= 21) {
			// TODO 잘못 입력받았을 때 처리
			System.out.println("Hit or Stand ? hit > 1, Stand > 2");
			Scanner scanner = new Scanner(System.in);
			String inputMsg = scanner.nextLine();

			if (inputMsg.equals("1")) {
				this.setSum(0);
				System.out.println(playercard);
				super.popCard();
				cardsum = getSum(cardsum, playercard);
				this.setSum(cardsum);

			} else if (inputMsg.equals("2")) {
				this.setSum(0);
				cardsum = getSum(cardsum, playercard);
				this.setSum(cardsum);
//				System.out.println("플레이어 카드 : " + playercard);
//				System.out.println("플레이어 최종 합계=" + cardsum);
				break;
			}

		}
		System.out.println("플레이어 카드 : " + playercard);
		System.out.println("플레이어 최종 합계=" + cardsum);

	}

}
