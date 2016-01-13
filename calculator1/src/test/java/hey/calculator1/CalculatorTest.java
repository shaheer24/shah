package hey.calculator1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static ICalculator calculator;
	
	@BeforeClass
	public static void beforeClass(){
		calculator = new Calculator();
		System.out.println("this is executaed before class");
		
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("this is executed after class");
		
	}
	
	@Before
	public void before(){
		System.out.println("this is execued before each test");
	}

	@After
	public void after(){
		System.out.println("this is executed after each test");
		
	}
	
	@Test
	public void addTest(){
		int result = calculator.add(3, 2);
		assertEquals(5,result);
		System.out.println("tested the add method");
	}
	
	@Test
	public void multiplyTest(){
		int result = calculator.mutiply(4, 2);
		assertEquals(8,result);
		System.out.println("tested the multiply method");
	}
	@Test
	public void subtractTest(){
		int result = calculator.subtract(4, 2);
		assertEquals(2,result);
		System.out.println("tested the subtract method");
	}
	
	@Test
	public void divideTest(){
		int result = calculator.divide(8, 4);
		assertEquals(2,result);
		System.out.println("tested the divide method");
	}
	@Test
	
	(expected = ArithmeticException.class)
	public void testDivideException() throws ArithmeticException{
		calculator.divide(8,0);
	}
	
	
	
}
	
	
	
