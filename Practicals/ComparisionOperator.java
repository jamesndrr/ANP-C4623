package operator;

import java.util.Scanner;

public class ComparisionOperator {

	public static void main(String[] args) {
		//equal to
		Scanner sc = new Scanner(System.in);
		System.out.println("Checking equal to operator");
		System.out.println("Enter first number:");
		int num1= sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		if(num1==num2) {
			System.out.println("Both the numbers are equal!");
		}
		else {
			System.out.println("Both the numbers are not equal!");
		}
		
		//not equal
		System.out.println("Checking not equal to operator");
		System.out.println("Enter the first number:");
		int num3=sc.nextInt();
		System.out.println("Enter the second number:");
		int num4=sc.nextInt();
		if(num3!=num4) {
			System.out.println("Both the numbers are not equal!");
		}
		else {
			System.out.println("Both the numbers are equal!");
		}
		
		//greater than
		System.out.println("Checking greater than operator");
		System.out.println("Enter first number:");
		int num5=sc.nextInt();
		System.out.println("Enter second number:");
		int num6=sc.nextInt();
		
		if(num5>num6) {
			System.out.println("Number "+num5+" is greater than "+num6);
		}
		else {
			System.out.println("Number "+num6+" is greater than "+num5);
		}
		
		//greater than or equal to
		System.out.println("Checking greater than or equal to operator");
		System.out.println("Enter first number:");
		int num7=sc.nextInt();
		System.out.println("Enter second number:");
		int num8=sc.nextInt();

		if(num7>=num8) {
			System.out.println("Number "+num7+" is greater than or equal to "+num8);
		}
		
		else {
			System.out.println("Number "+num8+" is greater than or equal to  "+num7);
		}
		
		//less than operator
		System.out.println("Checking less than operator");
		System.out.println("Enter first number:");
		int num9=sc.nextInt();
		System.out.println("Enter second number:");
		int num10=sc.nextInt();

		if(num9<num10) {
			System.out.println("Number "+num9+" is lesser than "+num10);
		}
		else {
			System.out.println("Number "+num10+" is lesser than "+num9);
		}

	}

}
