package corejava;

public class Asterisks {

	public static void main(String[] args) {
		int row = 5;
		
		for(int x = 1; x <= row; x++) 
		{
			for(int y = 1; y <= x; y++) 
			{
				System.out.print("* ");	
			}
			System.out.println();	//using println method to move the cursor to a new line
		}
	}

}
