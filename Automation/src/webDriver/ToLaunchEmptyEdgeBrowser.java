package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEmptyEdgeBrowser {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("www.instagram.com/");
	}

}
