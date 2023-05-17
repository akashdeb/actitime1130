package activeElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValueToActiveElement {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigating to the URL
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("Kuch bhi");

	}

}
