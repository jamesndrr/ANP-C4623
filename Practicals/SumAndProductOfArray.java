package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndProductOfArray {

	public static void main(String[] args) {
		//create a scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		//taking length of array from user
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		// create an array of integers with the given length and take input for each element
		int []arr=new int[a];
		System.out.println("Enter the elements of array:");
		for(int i=0; i<a; i++) {
			arr[i]=sc.nextInt();
		}
		// initialize two variables of the sum of even numbers and product of odd numbers
		int sum=0;
		int product=1;
		// loop through the array and check if each element is even or odd
		for(int i=0; i<a; i++) {
			if(arr[i]%2==0) {
				// if the element is even add it to the sum variable
				sum+=arr[i];
			}
			else {
				// if the element is odd multiply it to the product variable
				product*=arr[i];
			}
		}
		
		System.out.println("sum of even numbers:"+sum);
		System.out.println("Product of odd numbers:"+product);
	}

}
