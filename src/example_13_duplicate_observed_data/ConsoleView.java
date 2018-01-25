package example_13_duplicate_observed_data;

public abstract class ConsoleView {
	public String header;
	public String footer;
	public Article body;
	public Article getBody() {
		return body;
	}
	public void setBody(Article body) {
		this.body = body;
	}
	public abstract void print();
	public String getHeader() {
		return header;
	}
	public String getFooter() {
		return footer;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	};
	
}
