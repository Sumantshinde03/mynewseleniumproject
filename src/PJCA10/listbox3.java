package PJCA10;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class listbox3 {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<String>al=new ArrayList();
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[@id='Year']"));
		Select s=new Select(year);
	//	s.getAllSelectedOptions();
		List<WebElement>alloption=s.getOptions();
		for(WebElement option:alloption)
		{
	//	String Text=option.getText();
	//	System.out.println(Text);
		
		System.out.println(option.getText());
		
		
		}
		
		
	

		
		

	}

}
