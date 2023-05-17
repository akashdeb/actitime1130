package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		String prarentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.close();
		
		//driver.switchTo().window(prarentWindowId);
	}

}
