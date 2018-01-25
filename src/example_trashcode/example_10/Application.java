package example_trashcode.example_10;

import example_10_replace_typecode_stratergy.AdArticleType;
import example_10_replace_typecode_stratergy.MyArticleType;
import example_10_replace_typecode_stratergy.SharedArticleType;

public class Application {

	private static ArticleManager articlemanager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		articlemanager = ArticleManager.getInstance();
		
		articlemanager.createArticle("title1", "Hello World!", "alice", "alice@gmail.com",new SharedArticleType() );
		articlemanager.createArticle("title2", "Hello World!!", "bobby", "bobby@gamil.com", new MyArticleType());
		articlemanager.createArticle("title3", "Hello World!!!", "bobby", "bobby@gamil.com", new MyArticleType());
		articlemanager.createArticle("title4", "Hello World!!!!", "bobby", "bobby@gamil.com", new MyArticleType());
		articlemanager.createArticle("title5", "Hello World!!!!!", "alice", "alice@gmail.com", new MyArticleType());
		articlemanager.createArticle("AD", "Hello facebook", "facebook", "facebook@gmail.com", new AdArticleType());
		ManagedArticle mArticle = articlemanager.createArticle("???", "???????", "unknown", "unknown@gmail.com", new AdArticleType());
		System.out.println("---- mArticle ----");
		System.out.println("mArticle index : "+mArticle.getIndex());
		mArticle.getArticle().print();
		System.out.println("---- mArticle ----");
		mArticle.getArticle().changeType(new MyArticleType());
		
		System.out.println("---- mArticle update----");
		System.out.println("mArticle index : "+mArticle.getIndex());
		mArticle.getArticle().print();
		System.out.println("---- mArticle update----");
		articlemanager.printCurrentArticle();
		
	}
}
