package hijava.basic;

import hijava.practice.Man;

public class Person<T> {
	
	private T person;
	
	public void set(T person) {
		this.person = person;
	}

	public String getName() {
		return this.person.toString();
	}
	
	public static void main(String[] args) {
		Man m = new Man("Man");
		System.out.println(m);
		
		Students stu = new Students();
		System.out.println(stu);
		
		Person<Man> manperson = new Person<>();
		manperson.set(m);
		System.out.println("m=" + manperson.getName());
		Person<Students> studentperson = new Person<>();
		studentperson.set(stu);
		System.out.println("stu=" + studentperson.getName());
		
	}
	
	
}
