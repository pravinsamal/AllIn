package inter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openbrowser1 {
	
	public static WebDriver open(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions s=new ChromeOptions();
		s.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(s);
		
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}

}
