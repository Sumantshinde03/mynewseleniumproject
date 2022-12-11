package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://sandbox.abdm.gov.in/applications/Home/signup_form");
		WebElement  result=driver.findElement(By.xpath("//div[@class=' mb-3 mt-3']"));
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
