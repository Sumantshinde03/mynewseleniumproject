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

public class Test18 {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp=ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //	WebDriverWait wd=new WebDriverWait(driver,Duration.ofSeconds(40));
    	driver.get("https://www.naukri.com");
   // TakesScreenshot ts1=(TakesScreenshot) driver;
    //	WebElement ts=driver.findElement(By.id("keepLoggedInCheckBox"));
    //	WebElement ts=driver.findElement(By.xpath("//a[text()='Login']"));
    	WebElement ts=driver.findElement(By.xpath("//a[text()='Register']"));
    	File tempfiles=ts.getScreenshotAs(OutputType.FILE);
    	File destfile=new File("./Errorshot/acttime22.png");
    //	tempfiles.renameTo(destfile);
    	FileUtils.copyFile(tempfiles, destfile);

	}

	}


