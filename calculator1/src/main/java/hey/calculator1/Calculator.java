package hey.calculator1;

public class Calculator implements ICalculator {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int num=num1+num2;
		return num;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		int num=num1-num2;
		return num;
	}

	@Override
	public int mutiply(int num1, int num2) {
		// TODO Auto-generated method stub
		int num=num1*num2;
		return num;
	}

	@Override
	public int divide(int num1, int num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(num2==0)
			throw new ArithmeticException("divided by zero");
		int num=num1/num2;
		return num;
	}

}
