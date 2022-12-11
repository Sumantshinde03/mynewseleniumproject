package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Dimension ele=driver.findElement(By.id("loginButton")).getSize();
		System.out.println("width"+ele.getWidth());
		System.out.println("height"+ele.getHeight());
		
		Point ele2=driver.findElement(By.id("username")).getLocation();
		System.out.println("startX"+ele2.getX());
		System.out.println("starty"+ele2.getX());
		
		

	}

}
