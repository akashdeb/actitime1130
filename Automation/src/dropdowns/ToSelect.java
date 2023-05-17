package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://www.facebook.com/");

		// clicking on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();

		// Identifying the day dropdown
		WebElement dayElement = driver.findElement(By.id("day"));

		// selecting 7th day
		Select select = new Select(dayElement);
		select.selectByIndex(6);

		// identifying the month dropdown
		WebElement monthElement = driver.findElement(By.id("month"));

		// selecting Aug month
		Select select1 = new Select(monthElement);
		select1.selectByVisibleText("Aug");

		// identifying the month dropdown
		WebElement yearElement = driver.findElement(By.id("year"));

		// selecting 1998 year
		Select select2 = new Select(yearElement);
		select2.selectByValue("1998");
	}

}
