package corejava;

public class Person 
{
	
	private String name;
	private int age;
	
	//create parameterized constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//create getter setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
