package example_14_replace_inheritance_with_delegation;

public class PrimeMinister extends President{

	@Override
	public Official appointmentPublicOfficial(Resume resume) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean proclaimMartialLaw(boolean consent) {
		// TODO Auto-generated method stub
		return super.proclaimMartialLaw(consent);
	}

	@Override
	public String getEthics() {
		// TODO Auto-generated method stub
		return super.getEthics();
	}
	
}
