package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) {
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to the URL
		driver.get("https://demo.actitime.com/login.do");
		//Fetching the the tool tip text
		String toolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		//Printing the tool tip text in the console
		System.out.println(toolTipText);
		//Verifying the tool tip text
		if(toolTipText.contains("Do not select")) {
			System.out.println("Pass: The tool tip text is verified");
		}
		
		else
			System.out.println("Fail: The tool tip text is not verified");
		//Closing the browser
		driver.quit();
	}

}
