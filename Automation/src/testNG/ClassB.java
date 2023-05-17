package testNG;

import org.testng.annotations.Test;

public class ClassB {
	//@Test annotated method
		@Test(priority = 0)
		public void qspiders() {
			System.out.println("Hello");
		}
		
		//@Test annotated method
			@Test(priority = 0)
			public void jspiders() {
				System.out.println("Hi");
			}
}
