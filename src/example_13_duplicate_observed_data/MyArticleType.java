package example_13_duplicate_observed_data;

public class MyArticleType extends ArticleType{
	private int type;
	
	public MyArticleType() {
		super();
		this.type = Article.MYARTICLE;
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void print(Article article) {
		// TODO Auto-generated method stub
		System.out.println("MyArticle\n - title : "+article.getTitle()
		+"\n- content : "+article.getContent()
		+"\n- authorName : "+article.getAuthor().getAuthorName()
		+"\n- authorMail : "+article.getAuthor().getAuthorName()
		+"\n- CreatedAt : "+article.getPostedAt().getCreatedAt()
		+"\n- UpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
	}

}
