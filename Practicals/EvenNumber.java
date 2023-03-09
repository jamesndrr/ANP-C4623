package corejava;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int a;
		a = sc.nextInt();
		
		int i=2;
		while(i<=a) {
			System.out.println(i+ "");
			i+=2;
		}
	}

}
