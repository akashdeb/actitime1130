package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo() {
		int actualResult = 123;
		int expectedResult = 420;
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
		
	}
	
	
	
	

}
