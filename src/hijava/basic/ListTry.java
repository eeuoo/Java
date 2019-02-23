package hijava.basic;

import java.util.ArrayList;
import java.util.List;

public class ListTry {

	public static void main(String[] args) {
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
