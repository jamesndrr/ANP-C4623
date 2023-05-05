package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNoTest {

	@Test
	public void TestCalculate() 
	{
		assertEquals(12,SumOfEvenNo.calculate(6));
	}

}
