package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToNavigateToGoogle {
	
	@Test
	public void toNavGoogle() {
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
	}

}
