package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement allmonths = driver.findElement(By.id("month"));
		Select s=new Select(allmonths);
		List<WebElement> alloptions=s.getOptions();
		for(WebElement ele:alloptions)
		{
			s.selectByVisibleText(ele.getText());
			if(ele.isSelected())
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		

	}

}
