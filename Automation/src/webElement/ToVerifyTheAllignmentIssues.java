package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAllignmentIssues {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Automation.html");
		
		Point usernameTextFieldPos = driver.findElement(By.id("Qspiders")).getLocation();
		Point passwordTextFieldPos = driver.findElement(By.id("Jspiders")).getLocation();
		
		
		int xCoordinateOfUsername = usernameTextFieldPos.getX();
		int yCoordinateOfUsername = usernameTextFieldPos.getY();
		
		int xCoordinateOfPassword = passwordTextFieldPos.getX();
		int yCoordinateOfPassword = passwordTextFieldPos.getY();

		if(xCoordinateOfUsername == xCoordinateOfPassword) {
			System.out.println("Pass: The allignment is proper");
		}
		
		else
			System.out.println("Fail: The allignment is not proper");
		
		driver.quit();

	}

}
