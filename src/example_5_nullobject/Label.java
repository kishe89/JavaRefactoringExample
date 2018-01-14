package example_5_nullobject;

public class Label {
	private final String _label;

	public Label(String _label) {
		super();
		this._label = _label;
	}
	public void display() {
		System.out.println("display : "+_label);
	}
	public boolean isNull() {
		return false;
	}
	public String toString() {
		return "\""+ _label +"\"";
	}
	public static Label getInstance() {
		return NullLabel.getInstance();
	}
	private static class NullLabel extends Label{

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

}
