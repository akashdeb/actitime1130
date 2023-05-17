package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://demoqa.com/select-menu");

		//Identifying the dropdown
		WebElement dropdown = driver.findElement(By.id("cars"));

		Select select = new Select(dropdown);
		
		//Selecting the options
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);

		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);

		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		//Deselecting the options
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("audi");
		Thread.sleep(2000);
		select.deselectByVisibleText("Opel");
		
		//Selecting the options
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);

		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);

		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		//Deselectiong all options
		select.deselectAll();

		

		
		
	}

}
