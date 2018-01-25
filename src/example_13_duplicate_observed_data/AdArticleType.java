package example_13_duplicate_observed_data;

public class AdArticleType extends ArticleType{
	private int type;
	
	public AdArticleType() {
		super();
		this.type = Article.ADARTICLE;
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
	@Override
	public void print(Article article) {
		// TODO Auto-generated method stub
		System.out.println("Advertisement Article\n- title : "+article.getTitle()
		+"\n- content : "+article.getContent()
		+"\n- nauthorName : "+article.getAuthor().getAuthorName()
		+"\n- nauthorMail : "+article.getAuthor().getAuthorName()
		+"\n- nCreatedAt : "+article.getPostedAt().getCreatedAt()
		+"\n- nUpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
	}
}
