package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbymonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement allmonth = driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(allmonth);
		List<WebElement> ele=s.getOptions();
		for(WebElement all:ele)
		{
			s.selectByVisibleText(all.getText());
		}
		
		//s.selectByVisibleText("Mar");

	}

}
