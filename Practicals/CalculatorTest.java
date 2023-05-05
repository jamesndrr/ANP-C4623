package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test	
	public void testAdd()
	{
		Calculator cal=new Calculator();
		int result=cal.add(4,5);
		assertEquals(9,result);
	}
	
	@Test
	public void testSubtract()
	{
		Calculator cal=new Calculator();
		int result=cal.subtract(5,3);
		assertEquals(2,result);
	}
	
	@Test 
	public void testMultiply()
	{
		Calculator cal = new Calculator();
		int result = cal.multipy(5, 5);
		assertEquals(25,result);
	}
	
	@Test
	public void TestDivision()
	{
		Calculator cal = new Calculator();
		int result = cal.division(20, 10);
		assertEquals(2,result);
	}

}
