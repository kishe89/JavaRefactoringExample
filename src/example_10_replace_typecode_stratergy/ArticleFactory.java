package example_10_replace_typecode_stratergy;

public abstract class ArticleFactory {
	public abstract Article create(String title, String content, String authorName, String authorMail);
	public static class MyArticleFactory extends ArticleFactory{
		private static final MyArticleFactory instance = new MyArticleFactory();
		public static MyArticleFactory getInstance() {
			return instance;
		}
		@Override
		public Article create(String title, String content, String authorName, String authorMail) {
			// TODO Auto-generated method stub
			return new MyArticle(title, content, authorName, authorMail);
		}
		
	}
	public static class SharedArticleFactory extends ArticleFactory{
		private static final SharedArticleFactory instance = new SharedArticleFactory();
		public static SharedArticleFactory getInstance() {
			return instance;
		}
		@Override
		public Article create(String title, String content, String authorName, String authorMail) {
			// TODO Auto-generated method stub
			return new SharedArticle(title, content, authorName, authorMail);
		}
		
	}
	public static class AdArticleFactory extends ArticleFactory{
		private static final AdArticleFactory instance = new AdArticleFactory();
		public static AdArticleFactory getInstance() {
			return instance;
		}
		@Override
		public Article create(String title, String content, String authorName, String authorMail) {
			// TODO Auto-generated method stub
			return new AdArticle(title, content, authorName, authorMail);
		}
		
	}
}
