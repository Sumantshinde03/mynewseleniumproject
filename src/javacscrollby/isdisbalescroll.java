package javacscrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisbalescroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		Thread.sleep(5000);
		WebElement Element = driver.findElement(By.linkText("Download jdk-8u202-linux-arm64-vfp-hflt.tar.gz"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()",Element); 
		

	}

}
