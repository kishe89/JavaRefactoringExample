package example_13_duplicate_observed_data;

public enum ArticleTypeEnum {
	MyArticle{

		@Override
		public ConsoleView createView() {
			// TODO Auto-generated method stub
			return new MyArticleView();
		}
		
	},
	SharedArticle{

		@Override
		public ConsoleView createView() {
			// TODO Auto-generated method stub
			return new ShareArticleView();
		}
		
	},
	AdArticle{

		@Override
		public ConsoleView createView() {
			// TODO Auto-generated method stub
			return new AdArticleView();
		}
		
	};
	public abstract ConsoleView createView();
}
