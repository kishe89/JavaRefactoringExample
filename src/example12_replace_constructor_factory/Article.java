package example12_replace_constructor_factory;

public abstract class Article {
	private String title;
	private String content;
	private String password;
	private Author author;
	private PostedAt postedAt;
	
	protected Article() {
		super();
	}

	protected Article(String title, String content, String authorName, String authorMail) {
		super();
		this.title = title;
		this.content = content;
		this.author = new Author(authorName, authorMail);
		this.postedAt = new PostedAt();
	}

	public abstract void print();
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
