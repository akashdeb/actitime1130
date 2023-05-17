package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimensions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println("Both height and width "+dim);
		
		int width = dim.getWidth();
		int height=dim.getHeight();
		
		System.out.println("The width is : "+width);
		System.out.println("The height is : "+height);
		
		
	}

}
