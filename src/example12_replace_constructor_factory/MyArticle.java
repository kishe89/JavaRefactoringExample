package example12_replace_constructor_factory;

public class MyArticle extends Article{

	protected MyArticle() {
		super();
	}
	protected MyArticle(String title, String content, String authorName, String authorMail) {
		super(title, content, authorName, authorMail);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MyArticle\n - title : "+this.getTitle()
		+"\n- content : "+this.getContent()
		+"\n- authorName : "+this.getAuthor().getAuthorName()
		+"\n- authorMail : "+this.getAuthor().getAuthorName()
		+"\n- CreatedAt : "+this.getPostedAt().getCreatedAt()
		+"\n- UpdatedAt : "+this.getPostedAt().getUpdatedAt()+"\n");
	}

}
