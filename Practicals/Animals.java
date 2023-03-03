package corejava;

abstract class Animals {
	protected int age;
	
	//create parameterized constructor
	public Animals(int age) {
		super();
		this.age = age;
	}
	//create getter setter methods

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
