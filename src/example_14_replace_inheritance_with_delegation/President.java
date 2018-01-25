package example_14_replace_inheritance_with_delegation;

public class President extends Official{
	private String ethics;
	
	public President() {
		super();
	}

	public President(String ethics) {
		super();
		this.ethics = ethics;
	}
	public Official appointmentPublicOfficial(Resume resume) {
		if(resume.getEthics().isEmpty()) {
			return null;
		}
		return new Official(resume);
	}
	public boolean proclaimMartialLaw(boolean consent) {
		if(consent) {
			return true;
		}
		return false;
	}
	
	@Override
	public String getEthics() {
		// TODO Auto-generated method stub
		return ethics;
	}	
}
