package example_13_duplicate_observed_data;

public class ShareArticleView extends ConsoleView {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SharedArticle\n - title : "+super.body.getTitle()
		+"\n- content : "+super.body.getContent()
		+"\n- authorName : "+super.body.getAuthor().getAuthorName()
		+"\n- authorMail : "+super.body.getAuthor().getAuthorName()
		+"\n- CreatedAt : "+super.body.getPostedAt().getCreatedAt()
		+"\n- UpdatedAt : "+super.body.getPostedAt().getUpdatedAt()+"\n");
	}

}
