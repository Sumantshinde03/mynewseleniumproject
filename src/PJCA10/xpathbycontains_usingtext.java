package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains_usingtext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'_6luy ')]")).sendKeys("abc");

		driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("abc");
		
		//driver.findElement(By.xpath("//a[contains(@href,'recover')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}

}
