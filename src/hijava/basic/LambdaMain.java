package hijava.basic;

public class LambdaMain {

	public static void main(String[] args) {
		ld1();
		operation();
	}

	
	private static void operation() {
		LambdaCalc add = (x, y) -> (x + y);
		LambdaCalc sub = (x, y) -> (x - y);
		LambdaCalc mul = (x, y) -> (x * y);
		LambdaCalc div = (x, y) -> (x / y);
		
		System.out.println(add.operation(1, 2));
		System.out.println(sub.operation(1, 2));
		System.out.println(mul.operation(1, 2));
		System.out.println(div.operation(1, 2));
		
	}
	
	
	private static void ld1() {
		LambdaStudent ls1 = (id, name) -> new Students(id, name);
		stufn(ls1, 10, "joo");
		
		LambdaStudent ls2 = (id, name) -> new Students(id * 3, name + "님");
		stufn(ls2, 20, "lee");
	}
	
	 private static void stufn(LambdaStudent ld, int id, String name) {
		 System.out.println("stu=" + ld.makeStudent(id, name));
	 }
}
