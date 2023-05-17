package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySingleSelect {

	public static void main(String[] args) {
		// Launching the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				// Nav to the URL
				driver.get("https://www.facebook.com/");
				
				// clicking on the Create new account button
				driver.findElement(By.linkText("Create new account")).click();

				// identifying the month dropdown
				WebElement monthElement = driver.findElement(By.id("month"));

				// selecting Aug month
				Select select = new Select(monthElement);
				boolean multiple = select.isMultiple();
				
				if(multiple) {
					System.out.println("The dropdown is multi-select");
				}
				
				else
					System.out.println("The dropdown is single-select");

				
	}

}
