package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		Thread.sleep(5000);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		emailTextBox.sendKeys("akashdeb@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement continueButton = driver.findElement(By.xpath("(//button[contains(text(), 'Continue')])[1]"));
		boolean enabled = continueButton.isEnabled();
		
		if(enabled) {
			System.out.println("Pass: The button is enabled");
		}
		
		else
			System.out.println("Fail: The button is not enabled");

	}

}
