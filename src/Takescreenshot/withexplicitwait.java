package Takescreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class withexplicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(40));
    	driver.get("https://demo.actitime.com/login.do");
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("loginButton")).click();
    	Thread.sleep(2000);
	String expectdurl="https://demo.actitime.com/user/submit_tt.do";
	//wd.until(ExpectedConditions.urlToBe(expectdurl));
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
