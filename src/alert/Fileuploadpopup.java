package alert;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
					WebDriver driver =new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demo.guru99.com/test/upload/");
					driver.findElement(By.xpath("//div[@id='file_wraper0']")).click();
					Thread.sleep(2000);
					Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Application(.exe)");

	}

}
