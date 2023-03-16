package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabectSorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//creating a scanner class for user input
		System.out.println("Enter size of the array:");
		//size of the array stores in variable 'a'
		int a=sc.nextInt();
		//creating array of string data type
		String []arr=new String[a];
		System.out.println("Enter the elements of array:");
		// taking input from user and assigning it to array elements
		for(int i=0; i<a; i++) {		
			arr[i]=sc.next();
		}
		//using sort method from arrays class 
		Arrays.sort(arr);
		System.out.println("Sorting of alphabects:");
		for(String i:arr) {
			System.out.println(i);
		}
	}

}
