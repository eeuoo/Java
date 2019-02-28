package hijava.blackjack;

import java.util.Iterator;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends Game {

	@Override
	public void getSum(int cardsum, List<String> playercard) {

		String num = playercard.get(playercard.size() - 1);
		num = num.substring(num.length() - 1);

		if (num.equals("0") || num.equals("J") || num.equals("Q") || num.equals("K")) {
			num = "10";
		} else if (num.equals("A")) {
			System.out.println(playercard);
			System.out.println("a value ? 11 → 1, 1 → 1");
			Scanner scan = new Scanner(System.in);
			String aValue = scan.nextLine();

			// TODO 잘못 입력받았을 때 처리
			if (aValue.equals("11")) {
				num = "11";
			} else if (aValue.equals("1")) {
				num = "1";
			}

			cardsum += Integer.parseInt(num);
		}
	}

	@Override
	public void ing(int cardsum, List<String> playercard) {

		while (cardsum <= 21) {
			// TODO 잘못 입력받았을 때 처리
			System.out.println("Hit or Stand ? hit → 1, Stand → 2");
			Scanner scanner = new Scanner(System.in);
			String inputMsg = scanner.nextLine();

			if (inputMsg.equals("1")) {
				super.popCard();
				System.out.println(playercard);
				getSum(cardsum, playercard);

			} else if (inputMsg.equals("2")) {
//				System.out.println("플레이어 카드 : " + playercard);
//				System.out.println("플레이어 최종 합계=" + cardsum);
				break;
			}

		}
		System.out.println("플레이어 카드 : " + playercard);
		System.out.println("플레이어 최종 합계=" + cardsum);

	}

}
