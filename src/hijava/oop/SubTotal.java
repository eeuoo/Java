package hijava.oop;

public class SubTotal {
	
	public int sum(int[] nums) {
		int result = 0;
		for (int i : nums)
			result += i;

		return result;
	}
	
	public int avg(int[] nums) {
		int sum = sum(nums);
		return sum / nums.length ;
	}

}
