
package space_replace;

public class SpaceReplace {
	
	public static void space_replace_function(String sentence) {
		int space_count = count_spaces(sentence);
		int newLength = sentence.length() + space_count*2;
		char[] array = new char[newLength];
		array[newLength-1] = '\0';
		int temp = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				array[temp] = '%';
				array[temp+1] = '2';
				array[temp+2] = '0';
				temp = temp + 3;
			} else {
				array[temp] = sentence.charAt(i);
				temp++;
			}
		}
		for (int i = 0; i < sentence.length() + space_count*2; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static int count_spaces(String sentence) {
		int space_count = 0;
		int i = 0;
		
		while( i < sentence.length() - 1) {
			if (sentence.charAt(i) == ' ') 
				space_count++;
			i = i + 1;
		}
		return space_count;
	}
}
