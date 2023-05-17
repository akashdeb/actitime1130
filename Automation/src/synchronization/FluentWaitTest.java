package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//For 4 version
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
		
		FluentWait wait=new FluentWait(driver);
		//Total Duration
		wait.withTimeout(Duration.ofSeconds(20));
		//changing the polling perios from 500 millis to 100 millis
		wait.pollingEvery(Duration.ofMillis(100));
		//waiting for a condition
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		//igonoring all Exceptions
		wait.ignoring(Exception.class);
		
		continueButton.click();

	}

}
