package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=addidas+shoes&crid=O2872FC22A2S&sprefix=addidas+shoe%2Caps%2C327&ref=nb_sb_noss_2");
		
		
		String price = driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - Apple iPhone 13 (128GB)"
				+ " - Midnight\"]/ancestor::div[@class='sg-row']"
				+ "/descendant::span[text()='61,999']")).getText();
		System.out.println(price);
	
	}

}
