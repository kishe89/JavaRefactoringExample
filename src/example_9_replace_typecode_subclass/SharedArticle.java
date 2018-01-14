package example_9_replace_typecode_subclass;

public class SharedArticle extends Article{

	
	public SharedArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SharedArticle(String title, String content, String authorName, String authorMail) {
		super(title, content, authorName, authorMail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Shared Article\n - title : "+getTitle()
				+"\ncontent : "+getContent()
				+"\nauthorName : "+getAuthor().getAuthorName()
				+"\nauthorMail : "+getAuthor().getAuthorName()
				+"\nCreatedAt : "+getPostedAt().getCreatedAt()
				+"\nUpdatedAt : "+getPostedAt().getUpdatedAt()+"\n");
	}

	@Override
	public int getTypecode() {
		// TODO Auto-generated method stub
		return Article.SHAREDARTICLE;
	}
	
}
