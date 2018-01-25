package example_13_duplicate_observed_data;

public class Application {

	private static ArticleManager articlemanager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		articlemanager = ArticleManager.getInstance();
		ArticleAdapter adapter = new ArticleAdapter();
		articlemanager.createArticle("title1", "Hello World!", "alice", "alice@gmail.com", ArticleTypeEnum.SharedArticle );
		articlemanager.createArticle("title2", "Hello World!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title3", "Hello World!!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title4", "Hello World!!!!", "bobby", "bobby@gamil.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("title5", "Hello World!!!!!", "alice", "alice@gmail.com", ArticleTypeEnum.MyArticle);
		articlemanager.createArticle("AD", "Hello facebook", "facebook", "facebook@gmail.com", ArticleTypeEnum.AdArticle);
		articlemanager.setAdapter(adapter);
		articlemanager.notifyDataSetChanged();
	}
}
