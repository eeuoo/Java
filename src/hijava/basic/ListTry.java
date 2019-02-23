package hijava.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ListTry {

	public static void main(String[] args) {
//		stackQueue();
		maps();
		treesets();

	}

	private static void treesets() {
		TreeSet<Students> trset = new TreeSet<>();
		trset.add(new Students(100, "lee"));
		System.out.println(trset);
		
	}

	private static void maps() {
		Map<Integer, Students> map = new HashMap<>();
		Students s1 = new Students(100, "lee");
		Students s2 = new Students(200, "kim");
		Students s3 = new Students(300, "hong");
		
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		
		int searchId = 102;
		if (map.containsKey(searchId)) {
			Students s200 = map.get(searchId);
			System.out.println(s200.getName());
		} else {
			System.out.println(searchId +"번 학생이 없습니다.");
		}
		
	}

	private static void stackQueue() {
		List<Integer> stack = new ArrayList<>();
		List<Integer> queue = new ArrayList<>();

		stack.add(1);
		stack.add(2);
		stack.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(stack);
		System.out.println(queue);

		pop(stack, 1);
		System.out.println(stack);
		enqueue(queue, 1);
		System.out.println(queue);
	}

	public static void pop(List<Integer> lst, int count) {
		for (int i = 0; i < count; i++) {
			int a = lst.remove(lst.size() - 1);
			System.out.println(a);
		}
	}

	public static void enqueue(List<Integer> lst, int count) {
		for (int i = 0; i < count; i++) {
			int a = lst.remove(0);
			System.out.println(a);
		}
	}
}
