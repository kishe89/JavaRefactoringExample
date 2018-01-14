package example_2_enum;

public class Calculator implements Addition,Subtraction{
	@Override
	public int addition(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1+value2;
	}

	@Override
	public int subtraction(int value1, int value2) {
		// TODO Auto-generated method stub
		
//		if(value1-value2<0) {
//			return (value1-value2)*-1;
//		}
		return value1<value2?value2-value1:value1-value2;	
	}
	
}
