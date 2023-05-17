package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String id:allIds) {
			System.out.println(id);
		}
	}

}
