package Takescreenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	String expectdurl="https://demo.actitime.com/login";
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	
	if(currenturl.equals(expectdurl))
	{
		System.out.println("True:url is matching");
	}
	else
	{
		System.out.println("False:url is not matching");
	}
	
	
	}

}
