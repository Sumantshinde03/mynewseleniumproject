package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleisenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		boolean result=driver.findElement(By.xpath("//button[text()='Login in']")).isEnabled();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("element is enabled");
		}
		else {
			System.out.println("element is disabled");
		}	

	}

}
