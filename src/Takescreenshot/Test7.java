package Takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp =ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//TakesScreenshot ts=(TakesScreenshot) driver;
	WebElement Element=driver.findElement(By.id("loginButton"));
	File tempfiles=Element.getScreenshotAs(OutputType.FILE);
	//	System.out.println(tempfiles.getAbsolutePath());
	//	Thread.sleep(90000);
		File destfile=new File("./Errorshot/acttime13"+timestamp+".png");
	//	tempfiles.renameTo(destfile);
		FileUtils.copyFile(tempfiles, destfile);

	}

}
