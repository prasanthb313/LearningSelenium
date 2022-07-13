package ObjectExamples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		System.out.println("Entering numbers using scanner class");
		
		//defining scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= scan.nextInt();
		
		System.out.println("given number is "+a);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter string");
		String name=scan1.nextLine();
		System.out.println("given string is "+name);
	}
}
