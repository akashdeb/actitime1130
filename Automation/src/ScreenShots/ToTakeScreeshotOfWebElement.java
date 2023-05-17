package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreeshotOfWebElement {

	public static void main(String[] args) throws IOException {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		File source = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/loginButton1.png");
		Files.copy(source, destination);
	}

}
