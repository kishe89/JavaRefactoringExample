package example_5_nullobject;

public class NullLabel extends Label{

	private static final NullLabel instance = new NullLabel(); 
	
	public static Label getInstance() {
		return instance;
	}
	
	public NullLabel() {
		super("(none)");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
