package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToNavigateToFacebook {
	
	@Test
	public void toNavFB() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
}
	}


