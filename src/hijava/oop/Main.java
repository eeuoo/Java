package hijava.oop;

import java.util.ArrayList;
import java.util.Scanner;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {

		inputOper();

//		scanner();

//		oper();

//		total();

//		testimpl();

//		calc();

//		softwares();

//		netsports();

//		animal_bark();

//		abstsuper();	

//		arrlist();

//		mom_daughter();

//		helloWorld();

	}

	private static void inputOper() {
		CalcOper co = new CalcOper();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String res = inputScan(scanner, "계속하십니까??(계속:Enter, 그만:q) >> ");
			
			if ("q".equalsIgnoreCase(res)) {
				scanner.close();
				break;
			}
			
			int inputNum1 = inputScanNum(scanner, "연산할 값을 입력하세요 1 >> ");

			int inputNum2 = inputScanNum(scanner, "연산할 값을 입력하세요 2 >> ");

			String inputoper = inputScan(scanner, "연산자를 입력하세요 >>> ");

			if ("/".equals(inputoper)) {
				System.out.println(co.div(inputNum1, inputNum2));
			} else if ("*".equals(inputoper)) {
				System.out.println(co.mul(inputNum1, inputNum2));
			} else {
				System.out.println("연산자를 정확히 입력하세요.");
			}

		}
	}

	private static int inputScanNum(Scanner scanner, String msg) {
		int inputNum = Integer.parseInt(inputScan(scanner, msg));
		return inputNum;
	}

	private static String inputScan(Scanner scanner, String msg) {
		System.out.print(msg);
		String inputoper = scanner.nextLine();
		return inputoper;
	}

	private static void scanner() {
		System.out.print("메시지를 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		String inputMsg = scanner.nextLine();
		System.out.println("Input Message is " + inputMsg);

		System.out.println();

		System.out.print("숫자를 입력하세요>> ");
		double inputNum = scanner.nextDouble();
		System.out.println("Input Number is " + inputNum);
		scanner.close();

	}

	private static void oper() {
		CalcOper co = new CalcOper();

		System.out.println(co.div(15, 2));

	}

	private static void total() {
		int[] arr = new int[] { 1, 2, 5, 9 };

		SubTotal st = new SubTotal();
		TotalImpl ti = new TotalImpl();

		System.out.println("Total=" + st.sum(arr));
		System.out.println("Total=" + ti.sum(arr));
	}

	private static void testimpl() {
		TestInterface in = new TestImpl();
		TestImpl ti = new TestImpl();

		in.print("aaa");
		TestInterface.out(100); // in.out은 부를 수 없고 TestInterface로 불러야한다.
		ti.print("bbb");
		TestInterface.out(100);

		Dog.eat("meat");
	}

	private static void calc() {
		Calculator calc = new CalcImpl();
		System.out.println(calc.add(1, 3));
	}

	private static void softwares() {
		SoftWare website = new WebSite();
		SoftWare mobileapp = new MobileApp();

		website.work();
		System.out.println("---------");
		mobileapp.work();

	}

	private static void netsports() {
		NetSports pp = new PingPong();
		NetSports tn = new Tennis();

		pp.play();
		System.out.println("---------");
		tn.play();

	}

	private static void animal_bark() {
		Animal dog = new Dog();
		Animal cat = new Cat();

		cat.bark();
		dog.bark();

	}

	private static void abstsuper() {
		AbstSuper sp = new AbstChild1();
		int x = 5;
		int y = 10;

		System.out.println("min=" + sp.min(x, y) + " max=" + sp.max(x, y));

	}

	private static void helloWorld() {
		Man lee = new Korean("현주");
		lee.sayHello();

		sayHi(lee);

		American john = new American("john");
		john.sayHello();

		sayHi(john);

		System.out.print("우리나라 사람은 ");
		worldEat(lee);
		System.out.print("미국 사람은 ");
		worldEat(john);

	}

	private static void sayHi(Man man) {
		man.sayHello();

	}

	private static void worldEat(Man h) {
		if (h instanceof Korean) {
			((Korean) h).eatRice();
		} else if (h instanceof American) {
			((American) h).eatBread();
		}
	}

	private static void mom_daughter() {
		Mom mom = new Mom();
		Mom daughter = new Daughter();

		mom.getName();
		daughter.getName();

		mom.eat();
		daughter.eat();

		if (daughter instanceof Daughter) {
			System.out.println("머겅");
		} else if (daughter instanceof Mom) {
			System.out.println("드세요");
		} else {
			System.out.println("먹어요");
		}

		mom.say();
		daughter.say();

		drink(mom);
		drink(daughter);

	}

	private static void drink(Mom m) {
		if (m instanceof Daughter) {
//			Daughter s = (Daughter)m;   // 캐스팅 방법 1
			((Daughter) m).drinkMilk(); // 캐스팅 방법 2
		} else if (m instanceof Mom) {
			m.drinkBeer();
		}
	}

	private static void arrlist() {
		ArrayList<Man> people = new ArrayList<Man>();

		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			people.add(m);
			m.buyCoffe(1);
		}

		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}

}
