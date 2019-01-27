package hijava.oop;

import hijava.practice.Man;

public class American extends Man {
	
	public American(String name) {
		super(name);
	}

	public void sayHello() {
		System.out.println("Hello. I'm " + getName() + "." );
	}

	public void eatBread() {
		System.out.println("빵을 먹습니다.");
	}

}
