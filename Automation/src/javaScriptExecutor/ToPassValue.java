package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValue {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Nav to the URL
		driver.get("https://demoapp.skillrary.com/");
		
		//identifying the disabled text field
		WebElement textField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//downcasting driver reference to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Passing value to the disabled text field
		js.executeScript("arguments[0].value='Qspiders'", textField);
	}

}
