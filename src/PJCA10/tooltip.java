package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedtooltip="Do not select if this computer is shared";
		String acttooltip=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("Title");
		//System.out.println(ele);
		if(acttooltip!=null)
		if(acttooltip.contains(expectedtooltip)) {
			System.out.println("True:tooltip is Matching");
		}
		else
		{
			System.out.println("False:Tool tip is not matching");
		}
	else
	{
		System.out.println("Tool tip not eqaual to null");
	}
		

	}
	
}
