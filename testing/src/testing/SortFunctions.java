package testing;

public class SortFunctions {

	public static void selectionSort(int[] myArray) {
		for (int i=0; i < myArray.length; i++) {
			int currentMin = i;
			for (int j=i; j < myArray.length; j++) {
				if (myArray[currentMin] > myArray[j]) {
					currentMin = j;
				}
			}
			if (currentMin != i) {
				int temp = myArray[i];
				myArray[i] = myArray[currentMin];
				myArray[currentMin] = temp;
			}
		}
	}
	
	public static void insertionSort(int[] myArray) {
		for (int i=0; i < myArray.length; i++) {
			int j = i;
			int currentValue = myArray[i];
			while (j > 0 && myArray[j-1] >= currentValue) {
				myArray[j] = myArray[j-1];
				j--;
			}
			myArray[j] = currentValue;
		}
	}
	
	public static void bubbleSort(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < (myArray.length - i); j++) {
				if (myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
	}
	
	public static void mergeSort() {
		
	}
	
	public static void mergeHelper() {
		
	}
	
	public static void main(String args[]) {
		int[] myArray = {4,3,7,3,4,2,7,9,4,4,2};
		selectionSort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
			System.out.print(", ");
		}
		System.out.println();
		int[] myArray2 = {5,2,7,3,5,2,5,2,7,2,8};
		insertionSort(myArray2);
		for (int i = 0; i < myArray2.length; i++) {
			System.out.print(myArray2[i]);
			System.out.print(", ");
		}
		System.out.println();
		int[] myArray3 = {5,2,7,3,5,2,5,2,7,2,8};
		insertionSort(myArray3);
		for (int i = 0; i < myArray3.length; i++) {
			System.out.print(myArray3[i]);
			System.out.print(", ");
		}
	}
	
}
