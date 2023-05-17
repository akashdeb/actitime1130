package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagNameAndLogin {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigating to the URL
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField=driver.findElement(By.name("pwd"));
		WebElement loginButton=driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernameTagName = usernameTextField.getTagName();
		String passwordTagName = passwordTextField.getTagName();
		String loginButtonTagName = loginButton.getTagName();
		
		if(usernameTagName.equals("input") && passwordTagName.equals("input") 
				&& loginButtonTagName.equals("div")) {
			usernameTextField.sendKeys("admin");
			passwordTextField.sendKeys("manager");
			loginButton.click();
			System.out.println("Login is Successfull");
		}
		else
			System.out.println("One of the tag names are not proper");

	}

}
