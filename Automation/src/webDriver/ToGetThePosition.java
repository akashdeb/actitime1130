package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		 Point pos = driver.manage().window().getPosition();
	
		System.out.println(pos);
		
		int xCoordinate = pos.getX();
		int yCoordinate = pos.getY();
		
		System.out.println("The X Coordinate is : "+xCoordinate);
		System.out.println("The Y Coordinate is : "+yCoordinate);

	}

}
