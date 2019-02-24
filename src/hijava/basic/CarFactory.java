package hijava.basic;

import java.util.HashMap;

public class CarFactory {
	
	private HashMap<String, Car> h ;
	
	private static CarFactory cf;
	private CarFactory() {}   // 생성자
	public static CarFactory getInstance() {
		if (cf == null)
			cf = new CarFactory();
		return cf;

	}

	public Car createCar(String name) {
		Car aaa = new Car(name);
		h.put(aaa.name, aaa);
		
		return aaa;
	}
	
	
	
	
}
