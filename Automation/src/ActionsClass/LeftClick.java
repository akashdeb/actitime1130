package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://www.google.com");
		
		WebElement textfield = driver.findElement(By.name("q"));
		WebElement searchButton = driver.findElement(By.name("btnK"));
		
		Actions action=new Actions(driver);
		action.sendKeys(textfield, "Aaj Tak").moveByOffset(0, 50).click(searchButton).perform();
		
		
	}

}
