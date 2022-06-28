package a2806;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static WebDriver open(String url) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
//	String a=	driver.getCurrentUrl();
//	String b=driver.getTitle();
//	System.out.println(b +" "+  a);
//	
//	
//	Dimension d=new Dimension(400,500);
//	driver.manage().window().setSize(d);
//	
//	Point p=new Point(400, 700);
//	driver.manage().window().setPosition(p);

	}

}
