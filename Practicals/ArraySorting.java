package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int a = sc.nextInt();
		int [] arr = new int[a];
		System.out.println("Enter the elemnts in array");
		for(int i=0; i<a; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted arrays:");
		for(int i:arr) {
			System.out.println(i+"  ");
		}

}
}
