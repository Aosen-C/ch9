public class Longest {	
	public static void main(String[] args) {
		int highestLength = 0;
		String strOfHighest = "";
		
		for (int i = 0; i < args.length; i++) {
			int length = args[i].length();
			if (length > highestLength) {
				highestLength = length;
				strOfHighest = args[i];
			}
		}
		String firstAlphabetical = args[0];
		
		for (int i = 0; i < args.length; i++) {
			int diff = args[i].compareTo(firstAlphabetical);
			if (diff < 0) {
				firstAlphabetical = args[i];
			}
		}
		System.out.printf("Longest: %s (%d letters)\n", strOfHighest, highestLength);
		System.out.printf("First alphabetically: %s\n", firstAlphabetical);
	}
}
