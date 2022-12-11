package selectclass;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalloptioninalbeticalorder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//div[text()='Create a new account']")).click();
		Thread.sleep(3000);
		TreeSet<String>tr=new TreeSet<String>();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement>Multioptions=s.getOptions();
		System.out.println(Multioptions.size());
		for(WebElement singleoptions:Multioptions)
		{
			String Text=singleoptions.getText();
			tr.add(Text);
		}
		for(String s1:tr)
		{
			System.out.println(s1);
		}
		
	}

}
