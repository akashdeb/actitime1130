package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Xpath.html");
		
		WebElement textFldWithValueA = driver.findElement(By.xpath("//input[@value='A']"));
		WebElement textFldWithValueB = driver.findElement(By.xpath("//input[@value='B']"));
		WebElement textFldWithValueC = driver.findElement(By.xpath("//input[@value='C']"));
		WebElement textFldWithValueD = driver.findElement(By.xpath("//input[@value='D']"));
		WebElement textFldWithValueE = driver.findElement(By.xpath("//input[@value='E']"));
		
		Dimension dimensionOfA = textFldWithValueA.getSize();
		Dimension dimensionOfB = textFldWithValueB.getSize();
		Dimension dimensionOfC = textFldWithValueC.getSize();
		Dimension dimensionOfD = textFldWithValueD.getSize();
		Dimension dimensionOfE = textFldWithValueE.getSize();
		
		int heightOfA = dimensionOfA.getHeight();
		int widthOfA = dimensionOfA.getWidth();
		
		int heightOfB = dimensionOfB.getHeight();
		int widthOfB = dimensionOfB.getWidth();
		
		int heightOfC = dimensionOfC.getHeight();
		int widthOfC = dimensionOfC.getWidth();
		
		int heightOfD = dimensionOfD.getHeight();
		int widthOfD= dimensionOfD.getWidth();
		
		int heightOfE = dimensionOfE.getHeight();
		int widthOfE = dimensionOfE.getWidth();
		
		if(heightOfA == heightOfB && heightOfB==heightOfC && heightOfC==heightOfD && heightOfD==heightOfE && widthOfA==widthOfB && widthOfB==widthOfC && widthOfC==widthOfD && widthOfD==widthOfE) {
			System.out.println("Pass: The Dimension of all the textfield are same");
		}
		else
		System.out.println("Fail: The Dimension of all the textfield are not same");


		driver.quit();

	}

}
