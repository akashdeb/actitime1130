package basicTestScript;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testNG.BaseClass;

public class ToVerifyHomePage extends BaseClass {

	@Test
	public void toVerifyHomePage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.contains("Enter")) {
			System.out.println("Pass: The title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");
	
	}

}
