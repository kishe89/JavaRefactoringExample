package example_9_replace_typecode_subclass;

public class ArticleType {
	public static final ArticleType MYARTICLE = new ArticleType(0);
	public static final ArticleType SHAREDARTICLE = new ArticleType(1);
	public static final ArticleType ADARTICLE = new ArticleType(2);
	private final int typecode;
	
	
	public ArticleType(int typecode) {
		super();
		this.typecode = typecode;
	}

	public int getTypecode() {
		return typecode;
	}
	
}
