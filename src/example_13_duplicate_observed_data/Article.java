package example_13_duplicate_observed_data;

public class Article {
	private String title;
	private String content;
	private String password;
	private Author author;
	private PostedAt postedAt;
	public static final int MYARTICLE = 0;
	public static final int SHAREDARTICLE = 1;
	public static final int ADARTICLE = 2;
	private ArticleTypeEnum type;
	
	public Article() {
		super();
	}

	public Article(String title, String content, String authorName, String authorMail,ArticleTypeEnum type) {
		super();
		this.title = title;
		this.content = content;
		this.author = new Author(authorName, authorMail);
		this.postedAt = new PostedAt();
		this.type = type;
	}

	public void changeType(ArticleTypeEnum type) {
		this.type = type;
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
	
	
	public ArticleTypeEnum getType() {
		return type;
	}
	
	public boolean isNull() {
		return false;
	}
	
}
