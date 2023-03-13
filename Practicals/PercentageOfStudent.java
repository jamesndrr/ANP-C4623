package arrays;

import java.util.Scanner;

public class PercentageOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int total = 0;
		
		System.out.println("Enter marks of your 5 subjects:");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
			total+=a[i];
		}
		double percentage = total/5;
		System.out.println("Percentage of your marks is:"+percentage);
	}

}
