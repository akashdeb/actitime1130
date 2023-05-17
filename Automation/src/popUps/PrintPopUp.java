package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		Pattern fileName = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\file1.png");
		Pattern saveButton = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Selenium_March_1130_Batch\\Automation\\save.png");

		Screen screen=new Screen();
		screen.wait(fileName, 20);
		screen.type(fileName, "Demo123445");
		screen.click(saveButton);
		
		
	}

}
