package Takescreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempfiles=ts.getScreenshotAs(OutputType.FILE);
	//	System.out.println(tempfiles.getAbsolutePath());
	//	Thread.sleep(90000);
		File destfile=new File("./Errorshot/vtiger.png");
		tempfiles.renameTo(destfile);
		
		
		

	}

}
