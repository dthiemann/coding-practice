package linkedList_CodingInterview;

public class DynamicProgrammingExamples {

	/*
	 * Calculate the total number of different steps a child can take 
	 * down the stairs given they can traverse 1, 2, or 3 steps at once
	 */
	
	public static int numberOfDifferentTraversals(int steps) {
		if (steps < 0) {
			return 0;
		}
		
		if (steps == 0) { 
			return 1;
		}

		return numberOfDifferentTraversals(steps - 3) + 
				numberOfDifferentTraversals(steps - 2) + 
				numberOfDifferentTraversals(steps - 1);
	}
	
	public static int numberOfDifferentTraversalsDP(int steps, int[] map) {
		if (steps < 0) {
			return 0;
		}
		
		if (steps == 0) { 
			return 1;
		}
		
		if (map[steps] > -1)
			return map[steps];

		return map[steps] + numberOfDifferentTraversals(steps - 3) + 
				numberOfDifferentTraversals(steps - 2) + 
				numberOfDifferentTraversals(steps - 1);
	}
	
	public static void helper() {
		System.out.println(numberOfDifferentTraversals(15));
		
		int n = 15;
		int[] map = new int[n];
		for (int i = 0; i < n; i++) {
			map[0] = -1;
		}
		System.out.println(numberOfDifferentTraversalsDP(n, map));
	}
}
