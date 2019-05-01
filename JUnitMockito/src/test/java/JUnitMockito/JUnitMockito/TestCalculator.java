package JUnitMockito.JUnitMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

//STEPS:
//Update pom.xml with Junit version from 3.8.1 to of 4.11 [Latest by 15-10-2018]
//Remove "extends TestCase" from public class TestCalculator extends TestCase { 
public class TestCalculator {

	@Mock
	CalculatorServiceInteface calculatorServiceInteface;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	Calculator calulator =null;
	
	//CalculatorServiceInteface calculatorServiceInteface = mock(CalculatorServiceInteface.class);
	@Before
	public void setUp() {
	 calulator = new Calculator(calculatorServiceInteface);
	}

	@Test
	public void testCompute_Success() {
		when(calculatorServiceInteface.sum(3, 4)).thenReturn(7);
		assertEquals(21, calulator.compute(3, 4));

	}
}



/*ALTERNATE WAY TO DO THE SAME:

Calculator calulator = new Calculator(calculatorServiceInteface);
CalculatorServiceInteface calculatorServiceInteface = mock(CalculatorServiceInteface.class);

@Test
public void testCompute_Success() {
	when(calculatorServiceInteface.sum(3, 4)).thenReturn(7);
	assertEquals(21, calulator.compute(3, 4));

}*/