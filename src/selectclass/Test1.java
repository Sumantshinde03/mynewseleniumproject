package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement allmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(allmonth);
		if(s.isMultiple())
		{
			System.out.println("True:Its is Multilist");
		}
		else
		{
			System.out.println("False:Its is not Multilist");	
		}
		
		
		
		
		
	}

}
