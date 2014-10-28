import java.util.Scanner;

package space_replace;

public class Test {
	// Instance Varialbes
	String temp;
	
	
	// Instance Methods
	public Test(String x)  {
		temp = x;
	}
	public int getLength() {
		return temp.length(); 
	}
	
	public static void main(String[] args) {
		Test newTest = new Test("Hello");
		System.out.println(newTest.getLength());
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string");
		String tempString = in.next();
		System.out.println(tempString.length());
		
		
	}
}
