package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clears {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	WebElement ele = driver.findElement(By.id("username"));
	//	ele.sendKeys("admin");
	//	Thread.sleep(2000);
	//	ele.sendKeys(Keys.CONTROL+"a");
	//	Thread.sleep(2000);
	//	ele.sendKeys(Keys.CONTROL+"c");
	//Thread.sleep(2000);
	//	WebElement eles = driver.findElement(By.id("password"));
	//	ele.sendKeys("12345");
		
	//	WebElement ele1 = driver.findElement(By.id("username"));
	//	eles.sendKeys("null");
	//	driver.findElement(By.xpath("username")).sendKeys(null);
	driver.findElement(By.xpath("//div[text()='login']")).sendKeys(Keys.CONTROL);
	
		//driver.findElement(By.xpath("loginButton")).sendKeys(Keys.CONTROL);
		
		
		
		

	}

}
