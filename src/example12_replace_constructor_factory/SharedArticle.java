package example12_replace_constructor_factory;

public class SharedArticle extends Article{

	protected SharedArticle() {
		super();
	}
	protected SharedArticle(String title, String content, String authorName, String authorMail) {
		super(title, content, authorName, authorMail);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SharedArticle\n - title : "+this.getTitle()
		+"\n- content : "+this.getContent()
		+"\n- authorName : "+this.getAuthor().getAuthorName()
		+"\n- authorMail : "+this.getAuthor().getAuthorName()
		+"\n- CreatedAt : "+this.getPostedAt().getCreatedAt()
		+"\n- UpdatedAt : "+this.getPostedAt().getUpdatedAt()+"\n");
	}
}
