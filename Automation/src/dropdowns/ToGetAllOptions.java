package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetAllOptions {

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
		List<WebElement> allOptions = select.getOptions();
		//counting the no of options
		System.out.println("No of options present : "+allOptions.size());
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
	}

}
