package example_10_replace_typecode_stratergy;

import java.util.ArrayList;

public class Application {

	private static ArticleManager articlemanager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		articlemanager = ArticleManager.getInstance();
		
		articlemanager.createArticle("title1", "Hello World!", "alice", "alice@gmail.com", ArticleTypeEnum.SharedArticle );
		articlemanager.createArticle("title2", "Hello World!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title3", "Hello World!!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title4", "Hello World!!!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title5", "Hello World!!!!!", "alice", "alice@gmail.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("AD", "Hello facebook", "facebook", "facebook@gmail.com", ArticleTypeEnum.AdArticle);
		ManagedArticle mArticle = articlemanager.createArticle("???", "???????", "unknown", "unknown@gmail.com", ArticleTypeEnum.AdArticle);
		System.out.println("---- mArticle ----");
		System.out.println("mArticle index : "+mArticle.getIndex());
		mArticle.getArticle().print();
		System.out.println("---- mArticle ----");
		mArticle.getArticle().changeType(ArticleTypeEnum.MyArticle);
		
		System.out.println("---- mArticle update----");
		System.out.println("mArticle index : "+mArticle.getIndex());
		mArticle.getArticle().print();
		System.out.println("---- mArticle update----");
		articlemanager.printCurrentArticle();
		
		ArrayList<Article> list = null;
		articlemanager.setList(list);
//		try {
//			articlemanager.removeArticle();
//		}catch(IllegalArgumentException e) {
//			System.out.println(e.toString());
//			articlemanager.setList(copyCurrentList);
//		}
		articlemanager.removeArticle();
		articlemanager.printCurrentArticle();
	}
}
