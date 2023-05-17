package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Xpath.html");
		
		WebElement eTextFld = driver.findElement(By.xpath("//input[@value='E']"));
		
		eTextFld.clear();
		Thread.sleep(3000);
		eTextFld.sendKeys("Pappu");
		
	}

}
