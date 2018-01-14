package example_7_extract_class;

public class Application {

	private static ArticleManager articleManager;
	public static void main(String[] args) {
		
		articleManager = ArticleManager.getInstance();
		articleManager.createArticle("Article2", "Hello2", "bobby", "bobby@naver.com");
		articleManager.createArticle("Article1", "Hello", "alice", "alice@gmail.com");
		
		articleManager.printCurrentArticle();
		
		String query = "Article1";
		articleManager.findArticleWithTitle(query).print();
		
		articleManager.removeArticle().print();
		articleManager.removeArticleWithTitle(query).print();
		
		articleManager.printCurrentArticle();
		
	}
}
