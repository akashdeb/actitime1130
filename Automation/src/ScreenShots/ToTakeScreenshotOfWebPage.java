package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotOfWebPage {

	public static void main(String[] args) throws IOException {
		//Launching the browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		//1. Downcasting driver to TakesScreenhsot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//2. taking the screen shot in file format
		File source = ts.getScreenshotAs(OutputType.FILE);
		//3. determining the destination for the screenshot in the project
		File destination = new File("./screenshots/errorshot.png");
		//4. Copying the screenshot to the destination
		Files.copy(source, destination);
		
	}

}
