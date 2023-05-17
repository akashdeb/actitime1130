package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1. Constructor: to initialize the members
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Annotation: to identify the elements
	@FindBy(id="username")
	public WebElement usernameTextField;
	
	@FindBy(name="pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	public WebElement loginButton;
	
	//Business Logic
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	
	
	

}
