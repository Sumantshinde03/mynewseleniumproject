package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByindexvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/signup");
		WebElement allmonths = driver.findElement(By.id("month"));
		Select s=new Select(allmonths);
		s.selectByIndex(9);
		List<WebElement> element = s.getOptions();
		for(int i=0;i<=element.size()-1;i++) {
			s.selectByIndex(i);
		//	System.out.println("index");
		}

	}

}
