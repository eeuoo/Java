package hijava.oop;

public interface TestInterface {
	
	default void print (String str) {
		System.out.println(str);
	}
	
	// static은 new()하기 전에 생성되므로, static이 있는 해당 클래스로 불러야 한다. 
	static void out(int ii) {
		System.out.println("ii=" + ii);
	}

}
