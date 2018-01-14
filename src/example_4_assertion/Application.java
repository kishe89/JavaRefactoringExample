package example_4_assertion;

import java.util.ArrayList;

public class Application{

	public static void main(String args[]) throws Exception {
		/**
		 *실행시에 argument를 꼭 전달해주세요
		 */
		assert isNotEmpty(args);
		ArrayList<String> dummyList = new ArrayList<>();
		for(String item:args) {
			dummyList.add(item);
		}
		print(dummyList);
	}

	private static boolean isNotEmpty(String[] args){
		if(args.length == 0) {
			return false;
		}
		return true;
	}
	
	private static void print(ArrayList<String> arg) {
		for(String item: arg) {
			System.out.println(item);
		}
	}
}