package corejava;

public class Students extends Person {

	private String id;
	private String major;
	
	//create Parameterized constructor
	public Students(String name, int age, String id, String major) {
		super(name, age);
		this.id = id;
		this.major = major;
	}
	//crete getter setter methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
