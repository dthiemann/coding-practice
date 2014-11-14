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
		
		else if (steps == 0) { 
			return 1;
		}
		
		else if (map[steps] > -1)
			return map[steps];
		else {
			map[steps] = numberOfDifferentTraversalsDP(steps - 3, map) + 
					numberOfDifferentTraversalsDP(steps - 2, map) + 
					numberOfDifferentTraversalsDP(steps - 1, map);
			return map[steps];
		}
	}
	
	public static void helper() {
		System.out.println(numberOfDifferentTraversals(5));
		
		int n = 5;
		int[] map = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			map[i] = -1;
		}
		System.out.println(numberOfDifferentTraversalsDP(n, map));
	}
}
