package corejava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of multiplication table you want: ");
		int num = sc.nextInt();
		System.out.println("Multiplication Table of "+num+ ":");
		
		for(int i=1; i<=10; i++) 
		{
			
			System.out.println(num+ "*" +i+ "=" +(num*i));
		}
		sc.close();

	}

}
