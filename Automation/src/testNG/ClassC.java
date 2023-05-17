package testNG;

import org.testng.annotations.Test;

public class ClassC {

	// @Test annotated method
	@Test(priority = 2, invocationCount = 3)
	public void qspiders() {
		System.out.println("Hello");
	}

	// @Test annotated method
	@Test(priority = 1, invocationCount = 2)
	public void jspiders() {
		System.out.println("Hi");
	}

}
