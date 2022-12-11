package alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Automation\\April21bselenium\\selenium april21\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-Notifications");
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		

	}

}
