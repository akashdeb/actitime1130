package runtimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		TestTitleOfGoogle.test(new ChromeDriver());
		System.out.println("Succesfully tested in Chrome");
		TestTitleOfGoogle.test(new FirefoxDriver());
		System.out.println("Succesfully tested in Firefox");
		TestTitleOfGoogle.test(new EdgeDriver());
		System.out.println("Succesfully tested in Edge");


	}

}
