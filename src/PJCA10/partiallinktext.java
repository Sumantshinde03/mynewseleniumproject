package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/HTML/partiallinktext.html");
		driver.findElement(By.linkText("facebook")).click();
		driver.findElement(By.partialLinkText("face")).click();
		
		

	}

}
