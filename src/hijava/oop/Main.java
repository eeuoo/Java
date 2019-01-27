package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {
//		arrlist();

//		mom_daughter();

		helloWorld();
		
		
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
	
	private static void worldEat (Man h) {
		if (h instanceof Korean) {
			((Korean)h).eatRice();
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
