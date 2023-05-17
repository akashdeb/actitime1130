package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		String productPrice = "₹45,999";
		String productName = "APPLE iPhone 11 (Black, 128 GB)";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-"
				+ "show=on&otracker=AS_Query_HistoryAutoSuggest_5_0_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_5_0_na_na_na&as-pos=5&as-type=HISTORY&suggestionId=iphone&requestId=ee49c99e-e5ff-4a70-894c-7d660b88632d");
	
		String price = driver.findElement(By.xpath("//div[text()='"+productName+"']"
				+ "/ancestor::div[@class='_3pLy-c row']"
				+ "/descendant::div[text()='"+productPrice+"']")).getText();
	
		System.out.println(price);
	}

}
