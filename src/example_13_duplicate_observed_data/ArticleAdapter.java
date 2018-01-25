package example_13_duplicate_observed_data;

import java.util.ArrayList;

public class ArticleAdapter implements AdapterUpdateListener{
	private ArrayList<ConsoleView> row;
	
	
	
	public ArticleAdapter() {
		super();
		row = new ArrayList<>();
	}

	@Override
	public void updateData(ArrayList<Article> articles) {
		// TODO Auto-generated method stub
		for(Article article : articles) {
			createView(article);
		}
	}
	@Override
	public void createView(Article article) {
		// TODO Auto-generated method stub
		ConsoleView view = article.getType().createView();
		row.add(view);
		bindData(view, article);
	}
	
	@Override
	public void bindData(ConsoleView view,Article article) {
		// TODO Auto-generated method stub
		view.setBody(article);
		print(view);
	}

	@Override
	public void print(ConsoleView view) {
		// TODO Auto-generated method stub
		view.print();
	}	
}
