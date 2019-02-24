package hijava.basic;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private Map<String, Car> mapCar = new HashMap<>();

	private static CarFactory cf;

	private CarFactory() {} // 생성자

	public static CarFactory getInstance() {
		if (cf == null)
			cf = new CarFactory();
		return cf;
	}

	public Car createCar(String name) {
		
		if (!mapCar.containsKey(name)) {
			mapCar.put(name, new Car(name));
		}
		return mapCar.get(name);   // 방법 1 , 가독성이 좋다.
		
//		if (mapCar.containsKey(name)) {
//			return mapCar.get(name);
//		} else {
//			Car car = new Car();
//			mapCar.put(name, car);
//			return car;      
//		}                         // 방법 2 , 컴퓨팅 할 때 좋다.
	}

}
