package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_isenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement result=driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println(result);
		if(result.isEnabled())
		{
			System.out.println("true:targeted element is enabled");
		}
		else
		{
			System.out.println("false:targeted element is not enabled");
		}
	}

}
