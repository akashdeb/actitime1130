package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHover {

	public static void main(String[] args) {

		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://www.myntra.com/");
		
		WebElement element = driver.findElement(By.linkText("BEAUTY"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();

	}

}
