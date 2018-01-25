package example_14_replace_inheritance_with_delegation;

public class Official {
	private String ethics;
	private String name;
	private String major;
	public Official() {
		super();
	}
	public Official(Resume resume) {
		super();
		this.ethics = resume.getEthics();
		this.name = resume.getName();
		this.major = resume.getMajor();
	}
	public String getEthics() {
		return ethics;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	
}
