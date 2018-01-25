package example_10_replace_typecode_stratergy;

public enum ArticleTypeEnum {
	MyArticle{

		@Override
		public void print(Article article) {
			// TODO Auto-generated method stub
			System.out.println("MyArticle\n - title : "+article.getTitle()
			+"\n- content : "+article.getContent()
			+"\n- authorName : "+article.getAuthor().getAuthorName()
			+"\n- authorMail : "+article.getAuthor().getAuthorName()
			+"\n- CreatedAt : "+article.getPostedAt().getCreatedAt()
			+"\n- UpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
		}
		
	},
	SharedArticle{

		@Override
		public void print(Article article) {
			// TODO Auto-generated method stub
			System.out.println("Shared Article\n - title : "+article.getTitle()
			+"\ncontent : "+article.getContent()
			+"\nauthorName : "+article.getAuthor().getAuthorName()
			+"\nauthorMail : "+article.getAuthor().getAuthorName()
			+"\nCreatedAt : "+article.getPostedAt().getCreatedAt()
			+"\nUpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
		}
		
	},
	AdArticle{

		@Override
		public void print(Article article) {
			// TODO Auto-generated method stub
			System.out.println("Advertisement Article\n- title : "+article.getTitle()
			+"\n- content : "+article.getContent()
			+"\n- nauthorName : "+article.getAuthor().getAuthorName()
			+"\n- nauthorMail : "+article.getAuthor().getAuthorName()
			+"\n- nCreatedAt : "+article.getPostedAt().getCreatedAt()
			+"\n- nUpdatedAt : "+article.getPostedAt().getUpdatedAt()+"\n");
		}
		
	};
	public abstract void print(Article article);
}
