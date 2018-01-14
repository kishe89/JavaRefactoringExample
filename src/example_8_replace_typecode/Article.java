package example_8_replace_typecode;

public class Article {
	private String title;
	private String content;
	private String password;
	private Author author;
	private PostedAt postedAt;
	private final ArticleType articleType;
	
	public Article() {
		super();
		articleType = ArticleType.MYARTICLE;
	}
	public Article(String title, String content, String authorName, String authorMail, ArticleType articleType) {
		super();
		this.title = title;
		this.content = content;
		this.author = new Author(authorName, authorMail);
		this.postedAt = new PostedAt();
		this.articleType = articleType;
	}
	public void print() {
		System.out.println("Article - title : "+title
				+"\ncontent : "+content
				+"\nauthorName : "+this.getAuthor().getAuthorName()
				+"\nauthorMail : "+this.getAuthor().getAuthorName()
				+"\nCreatedAt : "+this.postedAt.getCreatedAt()
				+"\nUpdatedAt : "+this.postedAt.getUpdatedAt()+"\n");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ImmutableAuthor getAuthor() {
		return author;
	}
	public PostedAt getPostedAt() {
		return postedAt;
	}
	public int getTypecode() {
		return articleType.getTypecode();
	}
	public boolean isNull() {
		return false;
	}
	
}
