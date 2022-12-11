package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselecteds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele=driver.findElement(By.name("sex"));
		
		if(ele.isSelected())
		{
			System.out.println("True:Targeted ele is selected ");
		}
		else
		{
			System.out.println("false:Targeted ele is not selected ");
		}
		Thread.sleep(2000);
		ele.click();
		

	}

}
