package example_6_extract_to_method;

public class Main {

	private static String _content = "1234567890";

	public static void main(String[] args) {
		print(0);
	}

	private static void print(int times) {
		// TODO Auto-generated method stub
		
		// 테두리 출력
		System.out.print("+");
		for(int i = 0 ; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		// 내용 출력
		for(int i = 0 ; i < times; i++) {
			System.out.println("|"+_content+"|");
		}
		
		// 테두리 출력
		System.out.print("+");
		for(int i = 0 ; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
