package example_13_duplicate_observed_data;

public class MyArticleView extends ConsoleView {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MyArticle\n - title : "+super.body.getTitle()
		+"\n- content : "+super.body.getContent()
		+"\n- authorName : "+super.body.getAuthor().getAuthorName()
		+"\n- authorMail : "+super.body.getAuthor().getAuthorName()
		+"\n- CreatedAt : "+super.body.getPostedAt().getCreatedAt()
		+"\n- UpdatedAt : "+super.body.getPostedAt().getUpdatedAt()+"\n");
	}

	@Override
	public String getHeader() {
		// TODO Auto-generated method stub
		return super.getHeader();
	}

	@Override
	public String getFooter() {
		// TODO Auto-generated method stub
		return super.getFooter();
	}

	@Override
	public void setHeader(String header) {
		// TODO Auto-generated method stub
		super.setHeader(header);
	}

	@Override
	public void setFooter(String footer) {
		// TODO Auto-generated method stub
		super.setFooter(footer);
	}
	

}
