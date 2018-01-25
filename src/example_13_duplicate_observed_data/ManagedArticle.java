package example_13_duplicate_observed_data;


public class ManagedArticle {
	private Article article;
	private int index;
	public static final int NULL = -1;
	public ManagedArticle(Article article) {
		super();
		if(article.isNull()) {
			this.index = NULL;
			this.article = article;
		}else{
			throw new IllegalArgumentException("Please Use With NullArticle Object");
		}
	}

	public ManagedArticle(Article article, int index) {
		super();
		this.article = article;
		this.index = index;
	}

	public Article getArticle() {
		return article;
	}

	public int getIndex() {
		return index;
	}
}
