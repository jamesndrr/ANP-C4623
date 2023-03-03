package corejava;

public class InheritanceTester {

	public static void main(String[] args) {
		//create object of Person class
		Person a = new Person("Ramesh",20);
		System.out.println("Person:");
		System.out.println("Name: " +a.getName()); //object is used to access the method of class
		System.out.println("Age: " +a.getAge());
		
		Students b = new Students("Dhivyesh",20,"27","Maths");
		System.out.println("\nStudent: ");
		System.out.println("Name: "+b.getName());
		System.out.println("Age: "+b.getAge());
		System.out.println("ID: "+b.getId());
		System.out.println("Major: "+b.getMajor());
		
		GraduateStudent c = new GraduateStudent("Venkatesh",25,"461","Maths","Raja","Mutual Funds");
		System.out.println("\nGraduate Student:");
		System.out.println("Name: "+c.getName());
		System.out.println("Age: "+c.getAge());
		System.out.println("ID: "+c.getId());
		System.out.println("Major: "+c.getMajor());
		System.out.println("Advisor: "+c.getAdvisor());
		System.out.println("Thesis Topic: "+c.getThesisTopic());
	}

}
