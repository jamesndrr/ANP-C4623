package io;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		//using scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		try {
			//Asks the user to enter first number
			System.out.println("Enter first number: ");
			double num1=sc.nextDouble();
			
			//Asks the user to enter second number
			System.out.println("Enter second number: ");
			double num2= sc.nextDouble();
			
			//Asks the user to enter the operation
			System.out.println("Enter the operation you want to perform (+, -, *, /):");
			char operation=sc.next().charAt(0);
			
			//using switch case operation for the selected two numbers
			switch (operation){
			case '+':
				System.out.println(num1+ " + "+num2+ " = "+(num1+num2));
				break;
			case '-':
				System.out.println(num1+" - "+num2 +" = "+(num1-num2));
				break;
			case '*':
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
			case '/':
				//if the second number is zero it will throw an exception
				if(num2==0) {
					throw new ArithmeticException("Cannot divide by 0");
				}
				//performs the division operation
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			default:
				throw new IllegalArgumentException("Please select the above operation");
			
			}
		}
		catch(Exception e) {
			//Prints an error message
			System.out.println("Error: "+e.getMessage());
		}
	}

}
