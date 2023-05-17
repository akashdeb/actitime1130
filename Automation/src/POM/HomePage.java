package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(linkText = "Logout")
	public WebElement logoutLink;
	
	public void logoutAction() {
		logoutLink.click();
	}
	//For example: Dynamic xpath
	public String verifyHomePageTitle(String text) {
		return driver.findElement(By.xpath("//input[text()='"+text+"']")).getText();
	}
	
	
	

}
