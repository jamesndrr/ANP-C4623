package junit;

public class SumOfEvenNo 
{
	public static int calculate(int num1) 
	{
		int sum=0;
		for(int i=2; i<=num1; i+=2) 
		{
			sum+=i;
			
		}
		return sum;
		
	}
}
