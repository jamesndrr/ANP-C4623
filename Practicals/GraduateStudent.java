package corejava;

public class GraduateStudent extends Students{
	private String advisor;
	private String thesisTopic;
	
	//create Parameterized constructor
	public GraduateStudent(String name, int age, String id, String major, String advisor, String thesisTopic) {
		super(name, age, id, major);
		this.advisor = advisor;
		this.thesisTopic = thesisTopic;
	}
	//crete getter setter methods
	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesisTopic() {
		return thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	
	

}
