package example_13_duplicate_observed_data;

import java.util.ArrayList;

public interface AdapterUpdateListener {
	public void updateData(ArrayList<Article> articles);
	public void createView(Article articles);
	public void bindData(ConsoleView view, Article articles);
	public void print(ConsoleView view);
}
