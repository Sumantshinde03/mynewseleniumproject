package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributevalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String ele=driver.findElement(By.id("username")).getAttribute("sumant");
	//	System.out.println(ele.isEmpty());
		if(ele!=null)
		if(ele.isEmpty()) {
			System.out.println("True:it is empty");
		}
		else
		{
			System.out.println("false:it is not empty");
		}
	
	else
	{
		System.out.println("false:Attribute is not there in html");
	}
		
		
		

	}

}
