package example_7_extract_class;

public class NullArticle extends Article{
	
	private static final NullArticle instance = new NullArticle();
	
	public static NullArticle getInstance() {
		return instance;
	}
	
	public boolean isNull() {
		return true;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("is Null");
	}
}
