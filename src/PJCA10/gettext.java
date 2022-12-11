package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedtext="Please identify yourself";
		String acttext=driver.findElement(By.id("headerContainer")).getText();
		//System.out.println(ele);
		if(acttext.contains(expectedtext))
{
	System.out.println("pass:text is same");}
	else
	{
		System.out.println("fail:text is different");
	}
			
		}
		
		
		

	}


