package example_6_extract_to_method;

public class Banner {
	private final String _content;

	public Banner(String _content) {
		super();
		this._content = _content;
	}

	public void print(int times) {
		// 테두리 출력
		printBorder();

		// 내용 출력
		printContent(times);
		
		// 테두리 출력
		printBorder();
	}

	private void printContent(int times) {
		for(int i = 0 ; i < times; i++) {
			System.out.println("|"+_content+"|");
		}
	}

	private void printBorder() {
		System.out.print("+");
		for(int i = 0 ; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
