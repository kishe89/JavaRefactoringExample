package example_10_replace_typecode_stratergy;

import java.util.ArrayList;

public class ArticleManager {
	private static final ArticleManager instance = new ArticleManager();
	private ArrayList<Article> list = new ArrayList<>();
	public static ArticleManager getInstance() {
		return instance;
	}
	public ArticleManager() {
		super();
	}
	public Article createArticle(String title, String content, String authorName, String authorMail,ArticleFactory factory) {
		this.list.add(factory.create(title, content, authorName, authorMail));
		return this.list.get(this.list.size()-1);
	}
	public Article findArticleWithTitle(String query) {
		for(Article article : this.list) {
			if(article.getTitle().equals(query)) {
				return article;
			}
		}
		return NullArticle.getInstance();
	}
	public Article removeArticle() {
		if(list.size() != 0) {
			return this.list.remove(list.size()-1);
		}
		return NullArticle.getInstance();
	}
	public Article removeArticleWithTitle(String query) {
		for(int index = 0; index < this.list.size(); index++) {
			if(this.list.get(index).getTitle().equals(query)) {
				return this.list.remove(index);
			}
		}
		return NullArticle.getInstance();
	}
	public void printCurrentArticle() {
		for(Article article : this.list) {
			article.print();
		}
	}
	
}
