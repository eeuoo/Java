package hijava.oop;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

	public static void eat(String food) {
		System.out.println("dog eats " + food);
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);
	}
}
