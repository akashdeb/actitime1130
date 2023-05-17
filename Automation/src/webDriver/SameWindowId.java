package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SameWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String idForFacebook = driver.getWindowHandle();
		
		driver.navigate().to("https://www.instagram.com/");
		String idForInstagram = driver.getWindowHandle();
		
		System.out.println("Id for facebook : "+idForFacebook);
		System.out.println("Id for instagram : "+idForInstagram);
	}

}
