package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassE {
	
	// @Test annotated method
		@Test (groups = "smoke")
		public void a() {
			System.out.println("Login");
		}

		// @Test annotated method
		@Test(groups = "regression")
		public void b() {
			System.out.println("Select Product");
		}
		
		@Test(groups = "regression")
		public void c() {
			System.out.println("Add To cart");
		}
		
		@Test(groups = "smoke")
		public void d() {
			System.out.println("Payment");
		}


}
