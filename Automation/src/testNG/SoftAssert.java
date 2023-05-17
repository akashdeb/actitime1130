package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo() {
		int actualResult = 123;
		int expectedResult = 420;
		
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("Pass");

}
}