package PJCA10;

import java.security.NoSuchAlgorithmException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
          boolean  result; 
          try
           {
	result =driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	
           }
         catch(NoSuchElementException e )
           {
          result=false;	
           }
          System.out.println(result);
	
           if(result=true)
            {
	    System.out.println("element is found ");
            }
          else
            {
	    System.out.println("element is not found");
            }
	       }
	
          }
