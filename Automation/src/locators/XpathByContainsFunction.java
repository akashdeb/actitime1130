package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String paragraph = driver.findElement(By.xpath("//p[contains(text(), 'If you want to create robust, browser-based')]")).getText();
		System.out.println(paragraph);
	}

}
