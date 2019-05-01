package JUnitMockito.JUnitMockito;

public class Calculator {

	CalculatorServiceInteface calculatorServiceInteface;
	public Calculator(CalculatorServiceInteface calculatorServiceInteface) {
		this.calculatorServiceInteface = calculatorServiceInteface;
	}

	public int compute(int i, int j) {
		return calculatorServiceInteface.sum(i,j)*i;
	}
	
}
