package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.xpath("//input[@title=\"file input\"]")).sendKeys("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\testData\\photo.png");
		

	}

}
