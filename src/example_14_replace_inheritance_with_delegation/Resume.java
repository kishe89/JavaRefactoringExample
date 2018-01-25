package example_14_replace_inheritance_with_delegation;

public class Resume {
	private String name;
	private String major;
	private String ethics;
	public Resume(String name, String major, String ethics) {
		super();
		this.name = name;
		this.major = major;
		this.ethics = ethics;
	}
	
	
	public String getName() {
		return name;
	}


	public String getMajor() {
		return major;
	}


	public String getEthics() {
		return ethics;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Resume = name : "+this.getName()
		+"\nmajor : "+this.getMajor()
		+"\nethics : "+this.getEthics();
	}
	
}
