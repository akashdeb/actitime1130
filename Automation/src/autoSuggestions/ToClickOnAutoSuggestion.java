package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigating to the URL
		driver.get("https://www.google.com/");
		// Identifying the google text box and passing the text
		driver.findElement(By.name("q")).sendKeys("Bhai jaan");
		Thread.sleep(2000);
		// finding all autosuggestions
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'hai')]"));
		
		for(WebElement sugggestion:autoSuggestions) {
			if(sugggestion.getText().contains("cast")) {
				sugggestion.click();
				break;
				
			}
		}
	}

}
