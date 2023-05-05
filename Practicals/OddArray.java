package thursday;

public class OddArray {

	public static void main(String[] args) {
		int [] arr1 = new int [] {40,75,30,29,99,36,23,78,31,100};
		int countOdd = 0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=0)
			{
				countOdd++;
			}
		}
		int [] oddNumbers = new int[countOdd];
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=0)
			{
			oddNumbers[j] = arr1[i];
			j++;
		}
		}
		
		System.out.println("The Odd Numbers are");
		for(int i=0;i<oddNumbers.length;i++)
		{
			System.out.println(oddNumbers[i]+" ");
		}

	}

}
