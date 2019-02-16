package hijava.practice;

public class Person {
	String name;
	float height;
	int age;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, int page) {
		name = pname;
		height = pheight;
		age = page;
	}
	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", height=" + height + ", age=" + age + "]";
//	}
	
	public static void main(String[] args) {
		Person Lee = new Person("lee", 170F , 33);
		
		System.out.println(Lee);
	}

}

