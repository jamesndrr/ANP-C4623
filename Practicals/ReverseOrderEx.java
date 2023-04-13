package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseOrderEx {

	public static void main(String[] args) {
		//Create a treeset with custom comparator using reverseOrder
		TreeSet<Integer> num=new TreeSet<Integer>(Comparator.reverseOrder());
		
		//using add method to add elements
		num.add(10);
		num.add(50);
		num.add(90);
		num.add(20);
		num.add(30);
		
		System.out.println("Numbers in descending order: "+num);

	}

}
