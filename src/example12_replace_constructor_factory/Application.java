package example12_replace_constructor_factory;

import example12_replace_constructor_factory.ArticleFactory.MyArticleFactory;
import example12_replace_constructor_factory.ArticleFactory.SharedArticleFactory;

public class Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticleFactory myArticlefactory = MyArticleFactory.getInstance();
		ArticleFactory sharedArticlefactory = SharedArticleFactory.getInstance();
		Article article1 = myArticlefactory.create("title1", "Hello World!", "alice", "alice@gmail.com");
		Article article2 = sharedArticlefactory.create("I want it", "Hello World!", "bobby", "bobby@gmail.com");
		article1.print();
		article2.print();
	}
}

