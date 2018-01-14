package example_10_replace_typecode_stratergy;

public class Application {

	private static ArticleManager articlemanager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		articlemanager = ArticleManager.getInstance();
		
		articlemanager.createArticle("title1", "Hello World!", "alice", "alice@gmail.com", ArticleFactory.SharedArticleFactory.getInstance());
		articlemanager.createArticle("title2", "Hello World!!", "bobby", "bobby@gamil.com", ArticleFactory.MyArticleFactory.getInstance());
		articlemanager.createArticle("title3", "Hello World!!!", "bobby", "bobby@gamil.com", ArticleFactory.MyArticleFactory.getInstance());
		articlemanager.createArticle("title4", "Hello World!!!!", "bobby", "bobby@gamil.com", ArticleFactory.MyArticleFactory.getInstance());
		articlemanager.createArticle("title5", "Hello World!!!!!", "alice", "alice@gmail.com", ArticleFactory.SharedArticleFactory.getInstance());
		articlemanager.createArticle("AD", "Hello facebook", "facebook", "facebook@gmail.com", ArticleFactory.AdArticleFactory.getInstance());
		articlemanager.createArticle("???", "???????", "unknown", "unknown@gmail.com", ArticleFactory.AdArticleFactory.getInstance());
		
		articlemanager.printCurrentArticle();
		
	}
}
