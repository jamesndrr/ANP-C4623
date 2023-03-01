package corejava;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		Student a = new Student();
		a.setName("James Nadar");
		a.setId(20);
		a.setAge(20);
		
		System.out.println("Student ID: "+a.getId()+"\n"+"Student Name: "+a.getName()+"\n"+"Student Age: "+a.getAge()+"\n");

	}

}
