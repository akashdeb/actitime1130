package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Xpath.html");
		
		//if any xpath identifies multiple elements then find element method is going to identify the first element
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Babu");
	}
	}

