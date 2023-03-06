package corejava;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		//create a scanner class object to take input from the use
		Scanner sc = new Scanner(System.in); //here System.in takes the input
		System.out.println("Enter the number of times you want to print 'Happy Holi': ");
		int num = sc.nextInt();
		for (int i =0; i<num; i++) 
		{
			System.out.println("Happy Holi");
		}
				
			

	}

}
