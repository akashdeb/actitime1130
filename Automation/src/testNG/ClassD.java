package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassD {

	// @Test annotated method
	@Test
	public void a() {
		System.out.println("Login");
	}

	// @Test annotated method
	@Test(dependsOnMethods = "a")
	public void b() {
		Assert.fail();
		System.out.println("Select Product");
	}
	
	@Test(dependsOnMethods = "b")
	public void c() {
		System.out.println("Add To cart");
	}
	
	@Test(dependsOnMethods = "")
	public void d() {
		System.out.println("Payment");
	}

}
