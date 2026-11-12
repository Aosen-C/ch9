import java.util.Arrays;

public class Stats {

	public static void main(String[] args) {
		int[] nums = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		
		int count = 0;
		int sum = 0;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
	
		for (int i = 0; i < nums.length; i++) {
			count++;
			sum += nums[i];
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		
		double average = sum / count;
	
		System.out.printf("Count: %d\n", count);
		System.out.printf("Sum: %d\n", sum);
		System.out.printf("Min: %d\n", smallest);
		System.out.printf("Max: %d\n", largest);
		System.out.printf("Average: %.2f\n", average);
	}
}
