package example_8_replace_typecode;

public class Application {

	private static ArticleManager articlemanager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		articlemanager = ArticleManager.getInstance();
		articlemanager.createArticle("title1", "Hello World!", "alice", "alice@gmail.com", ArticleType.SHAREDARTICLE);
		articlemanager.createArticle("title2", "Hello World!!", "bobby", "bobby@gamil.com", ArticleType.MYARTICLE);
		articlemanager.createArticle("title3", "Hello World!!!", "bobby", "bobby@gamil.com", ArticleType.MYARTICLE);
		articlemanager.createArticle("title4", "Hello World!!!!", "bobby", "bobby@gamil.com", ArticleType.MYARTICLE);
		articlemanager.createArticle("title5", "Hello World!!!!!", "alice", "alice@gmail.com", ArticleType.SHAREDARTICLE);
		articlemanager.createArticle("AD", "Hello facebook", "facebook", "facebook@gmail.com", ArticleType.ADARTICLE);
		articlemanager.createArticle("???", "???????", "unknown", "unknown@gmail.com", ArticleType.ADARTICLE);
		
		articlemanager.printCurrentArticle();
		
	}
}
