package example_1_intro;

public class Calculator implements Addition,Subtraction{
	@Override
	public int addition(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1+value2;
	}

	@Override
	public int subtraction(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1-value2;
	}
	
}
