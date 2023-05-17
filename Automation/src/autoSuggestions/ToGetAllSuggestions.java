package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigating to the URL
		driver.get("https://www.google.com/");
		//Identifying the google text box and passing the text
		driver.findElement(By.name("q")).sendKeys("Bhai jaan");
		Thread.sleep(2000);
		//finding all autosuggestions
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'hai')]"));
		//printing the no. of autosuggestions in the console
		System.out.println("The no of Suggestions are : "+(autoSuggestions.size()-1));
		
		System.out.println(autoSuggestions);
		
		//printing all the AutoSuggestions
		for(WebElement suggestion :autoSuggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
