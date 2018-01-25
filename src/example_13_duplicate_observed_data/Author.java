package example_13_duplicate_observed_data;

public class Author implements ImmutableAuthor{
	
	private String authorName;
	private String authorMail;
	
	public Author(String authorName, String authorMail) {
		// TODO Auto-generated constructor stub
		this.authorName = authorName;
		this.authorMail = authorMail;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorMail() {
		return authorMail;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setAuthorMail(String authorMail) {
		this.authorMail = authorMail;
	}
	
}
