package PJCA10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectedss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement Female =driver.findElement(By.xpath("//label[text()='Female']/parent::span//input[@type='radio']"));
		
	    boolean result=Female.isSelected();
	    if(result=true)
	    {
	    	System.out.println("radio button allready is selected ");
	    }
	    else
	    {
	    	System.out.println("radio button  is not selected ");
	    	Female.click();
	    	
	    	 boolean results=Female.isSelected();
	 	    if(result=true)
	 	    {
	 	    	System.out.println("radio button allready is selected ");
	 	    }
	    }
		

	}

}
