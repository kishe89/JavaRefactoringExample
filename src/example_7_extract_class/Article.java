package example_7_extract_class;

public class Article {
	private String title;
	private String content;
	private String password;
	private Author author;
	private PostedAt postedAt;
	
	public Article() {
		super();
	}
	public Article(String title, String content, String authorName, String authorMail) {
		super();
		this.title = title;
		this.content = content;
		this.author = new Author(authorName, authorMail);
		this.postedAt = new PostedAt();
	}
	public void print() {
		System.out.println("Article - title : "+title
				+"\ncontent : "+content
				+"\nauthorName : "+this.author.getAuthorName()
				+"\nauthorMail : "+this.author.getAuthorName()
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
	public boolean isNull() {
		return false;
	}
	
}
