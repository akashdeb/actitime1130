package testNG;

import org.testng.annotations.Test;

public class ClassF {
	
	// @Test annotated method
			@Test (enabled = false)
			public void a() {
				System.out.println("Login");
			}

			// @Test annotated method
			@Test(invocationCount = 0)
			public void b() {
				System.out.println("Select Product");
			}
			
			@Test
			public void c() {
				System.out.println("Add To cart");
			}
			
			@Test
			public void d() {
				System.out.println("Payment");
			}

}
