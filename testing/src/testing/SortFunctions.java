package testing;

import java.util.ArrayList;

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
	
	public static void mergeSort(ArrayList<Integer> myList) {
		//ArrayList<Integer> B = mergeHelper((ArrayList<Integer>) myList.subList(0, myList.size()/2));
		//ArrayList<Integer> C = (ArrayList<Integer>) myList.subList(myList.size()/2, myList.size());
	}
	
	public static ArrayList<Integer> mergeHelper() {
		return null;
	}
	
	public static String reverseWordsInString(String myString) {
		String newString = "";
		
		String[] myArray = myString.split(" ", 0);
		int length = myArray.length;
		
		newString += myArray[length - 1];
		for (int i = 1; i < length; i++) {
			//System.out.println(i + myArray[1]);
			newString += " ";
			newString += myArray[length - i - 1];
		}
		return newString;
	}
	
	public static char getFirstNonrepeatingChar(String myString) {
		for (char i : myString.toCharArray()) {
			if (myString.indexOf(i) == myString.lastIndexOf(i)) {
				return i;
			}
		}
		return ' ';
	}
	
	public static ArrayList<String> createPrefixList(String myString) {
		
	}
	
	public static void main(String args[]) {
		/*
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
		*/
		
		String newString = reverseWordsInString("Hello World");
		System.out.println(newString);
		
		char myChar = getFirstNonrepeatingChar("stress");
		System.out.println(myChar);
	}
	
}
