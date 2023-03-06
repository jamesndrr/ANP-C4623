package corejava;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		//creating scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//creating a variable using scanner class object
		int num=sc.nextInt();
		//checking condition
		if(num>0) 
		{
			System.out.println("The number is positive");
		}
		else if(num<0) 
		{
			System.out.println("The number is negative");
		}
		else{
			System.out.println("The number is zero");
		}
		sc.close();
	}

}
