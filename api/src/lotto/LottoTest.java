package lotto;

public class LottoTest {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		String[] lucky = null;
		lucky = lotto.getLuckyNumber();
		for(String num : lucky) {
			System.out.print(num + " ");
		}
	}
}