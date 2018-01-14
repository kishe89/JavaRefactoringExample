package example_9_replace_typecode_subclass;

public class MyArticle extends Article{

	
	public MyArticle(String title, String content, String authorName, String authorMail) {
		super(title, content, authorName, authorMail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MyArticle\n - title : "+getTitle()
				+"\n- content : "+getContent()
				+"\n- authorName : "+getAuthor().getAuthorName()
				+"\n- authorMail : "+getAuthor().getAuthorName()
				+"\n- CreatedAt : "+getPostedAt().getCreatedAt()
				+"\n- UpdatedAt : "+getPostedAt().getUpdatedAt()+"\n");
	}

	@Override
	public int getTypecode() {
		// TODO Auto-generated method stub
		return Article.MYARTICLE;
	}
}
