package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectedoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/signup");
		WebElement allmonths = driver.findElement(By.id("day"));
		Select s=new Select(allmonths);
		WebElement element = s.getFirstSelectedOption();
		System.out.println(element.getText());
		
		
		

	}

}
