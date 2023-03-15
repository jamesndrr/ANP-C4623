package operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Addition
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the first number:");
		int num2 = sc.nextInt();
		int sum=num1 + num2;
		System.out.println("Sum of 2 numbers is:"+sum);
		//Subtraction
		System.out.println("Enter the first number for subtraction:");
		int num3=sc.nextInt();
		System.out.println("Enter the second number:");
		int num4 = sc.nextInt();
		int sub = num3 - num4;
		System.out.println("Subtraction of 2 numbers is:"+sub);
		//Multiplication
		System.out.println("Enter the first number for multiplication:");
		int num5=sc.nextInt();
		System.out.println("Enter the second number for multiplication:");
		int num6=sc.nextInt();
		int multiply=num5*num6;
		System.out.println("Multiplication of two numbers is:"+multiply);
		//division
		System.out.println("Enter the first number for division:");
		double num7=sc.nextInt();
		System.out.println("Enter the second number for division:");
		double num8 = sc.nextInt();
		double div=num7/num8;
		System.out.println("Division of 2 number is:"+div);
	}

}
