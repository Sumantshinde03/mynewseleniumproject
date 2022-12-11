package javacscrollby;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    //	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.naukri.com");
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy(0,900)");
    	Thread.sleep(2000);
    	 jse.executeScript("window.scrollBy(500,0)");

	}

}
