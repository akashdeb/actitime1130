package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyTheSearchFunctionality {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		Data data = new Data();
		String url = data.fetchDataFromExcelSheet("Sheet1", 5, 2);
		String location = data.fetchDataFromExcelSheet("Sheet1", 23, 2);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.findElement(By.id("searchboxinput")).sendKeys(location);
		
		driver.findElement(By.id("searchbox-searchbutton")).click();
		
		WebElement mapLocation = driver.findElement(By.xpath("//h1[text()='"+location+"']"));
		
		if(mapLocation.isDisplayed()) {
			System.out.println("Pass: The relevant location is displayed");
		}
		else
			System.out.println("Fail: The relevant location is not displayed");

	}
}
