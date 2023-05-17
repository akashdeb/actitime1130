package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigating to the URL
		driver.get("https://www.flipkart.com/");
		// identifying the image on the webpage
		WebElement image = driver.findElement(By.xpath(
				"//img[@src=\"https://rukminim1.flixcart.com/image/200/200/kokdci80/dslr-camera/v/e/x/z-24-200mm-z5-nikon-original-imag2zuekuxgxsgg.jpeg?q=70\"]"));
		// fetching the alt text of image
		String altText = image.getAttribute("alt");
		// printing the alt image on the console
		System.out.println(altText);
		// Verifying
		if (altText.contains("Camera")) {
			System.out.println("Pass: The alt text is verified");
		}

		else
			System.out.println("Fail: the alt text is not verified");
		// closing the browser
		driver.quit();
	}

}
