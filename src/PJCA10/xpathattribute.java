package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathattribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='u_2_b_pK']")).sendKeys("abc");
	//	Login first name
		driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("abc");
		
		//Login second name
		driver.findElement(By.xpath("//input[@type='text'])[3]")).sendKeys("xyz");
		
		//driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9158363897");
		
		
		

	}

}
