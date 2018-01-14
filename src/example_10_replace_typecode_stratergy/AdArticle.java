package example_10_replace_typecode_stratergy;

public class AdArticle extends Article{

	
	public AdArticle(String title, String content, String authorName, String authorMail) {
		super(title, content, authorName, authorMail);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Advertisement Article\n- title : "+getTitle()
				+"\n- content : "+getContent()
				+"\n- nauthorName : "+getAuthor().getAuthorName()
				+"\n- nauthorMail : "+getAuthor().getAuthorName()
				+"\n- nCreatedAt : "+getPostedAt().getCreatedAt()
				+"\n- nUpdatedAt : "+getPostedAt().getUpdatedAt()+"\n");
	}

	@Override
	public int getTypecode() {
		// TODO Auto-generated method stub
		return Article.SHAREDARTICLE;
	}
	
}
