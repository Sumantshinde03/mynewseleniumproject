package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.actitime.com");
		//Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("Pricing"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element, -100, 0);
		actions.perform();
		

	}

}
