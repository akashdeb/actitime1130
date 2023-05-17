package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		
		WebElement usernametextField = driver.findElement(By.id("Qspiders"));
		usernametextField.sendKeys("Shivani");
		
		WebElement passwordTextField = driver.findElement(By.name("Fahad"));
		passwordTextField.sendKeys("Tu lagti hain nani");
	
	}

}
