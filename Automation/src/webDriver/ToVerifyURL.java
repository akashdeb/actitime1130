package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("facebook")) {
			System.out.println("Pass: the url has been verified");
		}
		
		else
			System.out.println("Fail: the url has not been verified");
		
		driver.quit();
	}

}
