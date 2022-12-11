package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
	driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("sumant");
		driver.findElement(By.id("password")).sendKeys("sumant123");
		
	//	driver.findElement(By.id("loginbutton")).sendKeys("keyS.ENTER");
		driver.findElement(By.id("//button[text()='Sign in']")).click();;
		
		

	}

}
