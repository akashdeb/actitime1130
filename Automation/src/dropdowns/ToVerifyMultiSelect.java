package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select=new Select(dropdown);
		boolean multiple = select.isMultiple();
		
		if(multiple) {
			System.out.println("Pass: the dropdown is multiselect");
		}
		
		else
			System.out.println("Fail: the dropdown is single-select");

	}

}
