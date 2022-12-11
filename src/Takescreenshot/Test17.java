package Takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test17 {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp=ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //	WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(40));
    	driver.get("https://demo.actitime.com/login.do");
    //	TakesScreenshot ts=(TakesScreenshot) driver;
    	WebElement ts=driver.findElement(By.id("keepLoggedInCheckBox"));
    	
    	File tempfiles=ts.getScreenshotAs(OutputType.FILE);
    	File destfile=new File("./Errorshot/acttime18.png");
    //	tempfiles.renameTo(destfile);
    	FileUtils.copyFile(tempfiles, destfile);

	}

}
