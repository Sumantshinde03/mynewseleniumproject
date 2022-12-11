package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframescrooll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//	driver.switchTo().frame("iframeResult");
	//	driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
	   // driver.switchTo().frame(0);
		
		WebElement FrameEle = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame("FrameEle");
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		
		
		
		

	}

}
