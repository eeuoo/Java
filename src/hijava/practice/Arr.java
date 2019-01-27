package hijava.practice;

public class Arr {

	public static void main(String[] args) {
		ex1();
		ex2();
		mans();
		mans2();
	}

	private static void ex1() {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		printArray(nums);
	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		for (int i = 0; i < len; i++) {
			strs[i] = "str" + (i + 1);
		}

		printArray(strs);
	}

	private static void mans() {
		Man[] mans = new Man[9];
		int len = mans.length;
		for (int i = 0; i < len; i++) {
			mans[i] = new Man("김" +(i + 1) + "수");
		}

		for (Man man : mans) {
			System.out.println(man);
		}
	}
	
	private static void mans2() {
		Man[] mans = new Man[9];
		int len = mans.length;
		for (int i = 0; i < len; i++) {
			mans[i] = new Man("김" +(i + 1) + "수");
		}
		
		Man[] mans2 = new Man[len];
		for (int i = 0; i < len; i++) {
			mans2[i] = mans[i];    // shallow copy
//			mans2[i] = new Man(mans[i].getName());   //deep copy(clone)
		}
		
		for (Man man : mans2) {
			System.out.println(man);
		}
		
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
