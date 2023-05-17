package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Point oldPos = driver.manage().window().getPosition();
		System.out.println("The OLD position is : "+oldPos);
		
		Point pos = new Point(100, 100);
		driver.manage().window().setPosition(pos);
		
		Point newPos = driver.manage().window().getPosition();
		System.out.println("The NEW position is : "+newPos);
		
	}

}
