package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		
		String title = driver.getTitle();
		System.out.println("The Title of the page is : "+title);
		
		if(title.equals("Selenium")) {
			System.out.println("Pass: the title is verified");
		}
		else
			System.out.println("Fail: the title is not verified");

	}

}
