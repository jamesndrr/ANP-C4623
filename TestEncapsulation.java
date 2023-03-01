package corejava;

public class TestEncapsulation 
{

	public static void main(String[] args) 
	{
		//creating objects of class EncapsulationExample
		EncapsulationExample a = new EncapsulationExample();
		//objects is used to access the methods of class
		a.setId(1);
		a.setName("James");
		System.out.println("Id: "+a.getId()+"\n"+"Name: " +a.getName());
		

	}

}
