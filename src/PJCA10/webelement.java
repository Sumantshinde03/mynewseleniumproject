package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.close();
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
	//	WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	//	UN.sendKeys("abc");
	//	driver.findElement(By.xpath("//input[@name='email']")).clear();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement US=driver.findElement(By.xpath("//input[@name='email']"));
		US.sendKeys("abc");
		Thread.sleep(2000);
		US.clear();
		Thread.sleep(2000);
		US.sendKeys("xyz");
		Thread.sleep(20000);
		US.clear();
		
		
		
		
		
		
		
		
		
		

	}

}
