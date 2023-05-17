package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadPopUp {

	public static void main(String[] args) throws FindFailed {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Pattern fileName = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\file.png");
		Pattern openButton = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\button.png");
		
		Screen screen=new Screen();
		screen.wait(fileName, 20);
		screen.type(fileName, "C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\testData\\DemoPrint2231423.pdf");
		screen.click(openButton);
	}

}
