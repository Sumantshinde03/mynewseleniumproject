package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acttime5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
    	driver.get("https://demo.actitime.com/login.do");
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("loginButton")).click();
    	String Expectedtitle="actiTIME - Enter Time-Track12";
    	//Thread.sleep(2000);
     wait.until(ExpectedConditions.titleContains(Expectedtitle));
    	String acttitle=driver.getTitle();
    	System.out.println(acttitle);
    	
    	if(acttitle.contains(Expectedtitle))
    	{
    		System.out.println("True:Title is Matching ");
    	}
    	else
    	{
    		System.out.println("False:Title is not  Matching");
    	}
    	//System.out.println(acttitle);
    	



	}

}
