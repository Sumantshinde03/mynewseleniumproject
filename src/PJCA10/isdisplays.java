package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplays {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("//a[@class='license-link icn-download']")).click();
		boolean  ele = driver.findElement(By.linkText("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).isEnabled();
		System.out.println(ele);
		
		
		

	}

}
