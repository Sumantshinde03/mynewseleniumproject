package javacscrollby;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8scrollTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    //	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.naukri.com");
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
 
    	long height = (long)jse.executeScript("return document.body.scrollHeight");
    	System.out.println("Total height of webpage"+height);
    	Object element  = jse.executeScript("return document.body.scrollwidth");
    	//long width=(long)element;
    	//System.out.println("Total width of webpage"+width);
    	
    	long width = (long)jse.executeScript("return document.body.scrollweight");
    	System.out.println("Total height of webpage"+width);

	}

}
