package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement result = driver.findElement(By.id("//td[@id='keepMeLoggedInSection']"));
		 Thread.sleep(2000);
		 result.click();
		// System.out.println(result);
			if(result.isSelected())
			{
				System.out.println("true:targeted element is selected");
			}
			else
			{
				System.out.println("false:targeted element is not selected");
			}
			
		}
		
	}


