package example_1_intro;

public class ExtendedCalculator extends Calculator implements Multiplication,Division{

	@Override
	public int addition(int value1, int value2) {
		// TODO Auto-generated method stub
		return super.addition(value1, value2);
	}

	@Override
	public int subtraction(int value1, int value2) {
		// TODO Auto-generated method stub
		return super.subtraction(value1, value2);
	}

	@Override
	public int division(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1/value2;
	}

	@Override
	public int multiplication(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1*value2;
	}
	
}
