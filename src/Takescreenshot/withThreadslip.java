package Takescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withThreadslip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
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
	}

}
