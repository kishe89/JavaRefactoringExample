package example_13_duplicate_observed_data;

public class NullArticle extends Article{
	
	private static final NullArticle instance = new NullArticle();
	
	public static NullArticle getInstance() {
		return instance;
	}
	
	public boolean isNull() {
		return true;
	}

}
