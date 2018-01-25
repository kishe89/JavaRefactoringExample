package example_13_duplicate_observed_data;

public class SharedArticleType extends ArticleType{

	private int type;
	
	public SharedArticleType() {
		super();
		this.type = Article.SHAREDARTICLE;
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return this.type;
	}
	@Override
	public void print(Article article) {
		// TODO Auto-generated method stub
		System.out.println("Shared Article\n - title : "+article.getTitle()
		+"\ncontent : "+article.getContent()
		+"\nauthorName : "+article.getAuthor().getAuthorName()
		+"\nauthorMail : "+article.getAuthor().getAuthorName()
		+"\nCreatedAt : "+article.getPostedAt().getCreatedAt()
		+"\nUpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
	}

}
