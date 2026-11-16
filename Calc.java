public class Calc {
	public static int[] extractNums(String[] args) {
		int[] nums = new int[args.length - 1];
		for (int i = 1; i < args.length; i++) {
			nums[i - 1] = Integer.parseInt(args[i]); 
		}
		return nums;
	}
	
	public static void add(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
	public static void mult(int[] nums) {
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			product *= nums[i];
		}
		System.out.println(product);
	}
	
	public static void max(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			} 
		}
		System.out.println(max);
	}
	
	public static void min(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			} 
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
			return;
		}
		int[] nums = extractNums(args);
		
		if (args[0].equals("add")) {
			add(nums);
		} else if (args[0].equals("mult")) {
			mult(nums);
		} else if (args[0].equals("max")) {
			max(nums);
		} else if (args[0].equals("min")) {
			min(nums);
		} else {
			System.err.printf("Unkown operation: %s\n", args[0]);
		}
	}
}
