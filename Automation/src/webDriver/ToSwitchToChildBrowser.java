package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentId)) {
				Thread.sleep(3000);
				driver.quit();
			}
		}
		System.out.println(driver.getTitle());
	}

}
