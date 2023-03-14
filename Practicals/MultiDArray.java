package arrays;

import java.util.Scanner;

public class MultiDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//get the dimensions of the array from the user
		System.out.println("Enter the number of rows: ");
		int r=sc.nextInt();	
		System.out.println("Enter the number of coluumns: ");
		int c=sc.nextInt();	
		int[][] arr=new int[r][c];
		//get the values for the array from the user
		System.out.println("Enter the values for the array:");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.printf("Enter the values for elements(%d,%d):",i,j);
				arr[i][j]=sc.nextInt();
			}
		}
		//print output of the array
		System.out.println("The array is:");
		System.out.println("Enter the values for the array:");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(arr[i][j]+"  ");
				}
			System.out.println();
			}
		}
	

}
