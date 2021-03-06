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
	public ManagedArticle createArticle(String title, String content, String authorName, String authorMail,ArticleTypeEnum type) {
		this.list.add(new Article(title,content,authorName,authorMail,type));
		return new ManagedArticle(this.list.get(this.list.size()-1),this.list.size()-1);
	}
	public ManagedArticle findArticleWithTitle(String query) {
		for(int index = 0; index < this.list.size(); index++){
			if(this.list.get(index).getTitle().equals(query)) {
				return new ManagedArticle(this.list.get(index),index);
			}
		}
		return new ManagedArticle(NullArticle.getInstance());
	}
	public ManagedArticle removeArticle() throws NullPointerException {
		if(list.size() != 0) {
			return new ManagedArticle(this.list.remove(list.size()-1),list.size()-1);
		}
		return new ManagedArticle(NullArticle.getInstance());
	}
	public ManagedArticle removeArticleWithTitle(String query) {
		for(int index = 0; index < this.list.size(); index++) {
			if(this.list.get(index).getTitle().equals(query)) {
				return new ManagedArticle(this.list.remove(index),index);
			}
		}
		return new ManagedArticle(NullArticle.getInstance());
	}
	public void printCurrentArticle() {
		for(Article article : this.list) {
			article.print();
		}
	}
	public ManagedArticle updateArticle(Article article, int index) {
		if(index > this.list.size()-1 || index == -1) {
			return createArticle(article.getTitle(),
					article.getContent(),
					article.getAuthor().getAuthorName(),
					article.getAuthor().getAuthorName(),
					article.getType());
		}else {
			return new ManagedArticle(this.list.set(index, article),index);
		}
	}
	public void setList(ArrayList<Article> list) {
		this.list = list;
	}
	public ArrayList<Article> getList() {
		return list;
	}
	
}
