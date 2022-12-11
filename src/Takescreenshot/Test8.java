package Takescreenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
//	wd.until(ExpectedConditions.titleIs(expectedtitle));
	String expectedtitle="actTime-Login ";
	wd.until(ExpectedConditions.titleIs(expectedtitle));
	String acttitle=driver.getTitle();
	if(acttitle.contains(expectedtitle)) {
		System.out.println("True:Titles is Matching");
	}else {
		System.out.println("False:Titles is not matching");
	}

	}

}
