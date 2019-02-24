package hijava.basic;

public class LambdaMain {

	public static void main(String[] args) {
		
		ld1();
	}

	private static void ld1() {
		LambdaStudent ls1 = (id, name) -> new Students(id, name);
		Students stu1 = ls1.makeStudent(10, "joo");
		System.out.println(stu1);
		
		LambdaStudent ls2 = (id, name) -> new Students(id * 3, name + "님");
		Students stu2 = ls2.makeStudent(20, "lee");
		System.out.println(stu2);
	}
}
