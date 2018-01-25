package example_trashcode.example_10;

import example_10_replace_typecode_stratergy.ArticleType;

public class Article {
	private String title;
	private String content;
	private String password;
	private Author author;
	private PostedAt postedAt;
	public static final int MYARTICLE = 0;
	public static final int SHAREDARTICLE = 1;
	public static final int ADARTICLE = 2;
	private ArticleType type;
	
	public Article() {
		super();
	}

	public Article(String title, String content, String authorName, String authorMail,ArticleType type) {
		super();
		this.title = title;
		this.content = content;
		this.author = new Author(authorName, authorMail);
		this.postedAt = new PostedAt();
		this.type = type;
	}

	public void changeType(ArticleType type) {
		this.type = type;
	}
	public void print() {
		
	};
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
	public int getTypeCode() {
		return type.getTypeCode();
	}
	
	public ArticleType getType() {
		return type;
	}
	
	public boolean isNull() {
		return false;
	}
	
}
