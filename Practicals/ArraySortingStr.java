package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int a = sc.nextInt();
		String []arr=new String[a];
		System.out.println("Enter the elements in array:");
		for (int i=0;i<a;i++) {
			arr[i]=sc.next();
			
		}
		System.out.println("Sorted arrays is:");
		Arrays.sort(arr);
		for (String i:arr) {
			System.out.println(i+"  ");
		}
	}

}
