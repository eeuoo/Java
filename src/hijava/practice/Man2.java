package hijava.practice;


/* Man class의 instance인 hong과 john이 각각 10,000원이 있었다. hong은 coffee(3,000원) 1잔과
 * 도넛(2,500원) 2개를, john은 coffee(3,000원) 2잔과 도넛 1개를 사먹었다고 했을때, hong과 john의 남은 돈은
 * 각각 얼마인지 출력하시오.
 * 
 * 멤버 변수 - name(이름), amount(잔액)
 * 
 * 멤버 함수 - Man() : 생성자 함수 - 초기 잔액을 10,000원으로 Set!! - buyCoffee(int count),
 * buyDonut(int count) */


public class Man2 {

	private int money;
	private String name;
	public static final int COFFEE = 3000; // 변하지 못하게 고정
	public final static int DONUT = 2500;  // 변하지 못하게 고정
	
	
	private Man2() {
		this.money = 10000;
	}
	
	public Man2(String name) {
		this();
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void buyCoffe (int count) {
		this.submoney(COFFEE, count);
	}
	
	public void buyDoughnut (int count) {
		this.submoney(DONUT, count);
	}

	private void submoney(int price, int count) {
		this.money -= price * count;
	} // 밖에서는 부르지 못하게 private로 설정. 
	
	@Override
	public String toString() {
		return "Man [money=" + money + ", name=" + name + "]";
	}

}


