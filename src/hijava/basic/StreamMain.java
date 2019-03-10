package hijava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {

	public static void main(String[] args) {

//		test1();
//		test2();
		tryThis();

	}

	private static void tryThis() {
		List<Students> students = new ArrayList<>();
		students.add(new Students(90, "홍길동"));
		students.add(new Students(80, "김일수"));
		students.add(new Students(75, "김이수"));
		students.add(new Students(95, "김삼수"));

		students.forEach(s -> System.out.println("s =" + s.getName()));

		Students[] arr = new Students[students.size()];
		students.toArray(arr);

		int sum = Arrays.stream(arr).mapToInt(s -> s.getId()).sum();
		double avg = Arrays.stream(arr).mapToInt(s -> s.getId()).average().getAsDouble();
		System.out.println("sum = " + sum + ", avg = " + avg);

		Arrays.stream(arr).filter(s -> s.getId() >= 90).sorted().forEach(s -> System.out.println(s));

	}

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2 };
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(Arrays.stream(arr).average());
		System.out.println("avg = " + avg);

		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort = " + n));
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct = " + n));
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sd = " + n));

		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println("filter = " + n));

		System.out.println("reduce = " + Arrays.stream(arr).reduce(0, (p, n) -> p + n));

	}

	private static void test1() {
		List<Students> students = new ArrayList<>();
		students.add(new Students(100, "Hong100"));
		students.add(new Students(20, "Hong20"));
		students.add(new Students(5, "Hong5"));

		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("stream = " + n));

		System.out.println("stuIdSum = " + students.stream().mapToInt(s -> s.getId()).sum());

		System.out.println(students);
		System.out.println("--------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);

	}

}
