package inter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	
	public static  void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.manage().window().maximize();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
	String a=	driver.getTitle();
		System.out.println(a);
		System.out.println(driver.getCurrentUrl());
//		Dimension d=new Dimension(200,300);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(400,400);
//		driver.manage().window().setPosition(p);
		WebElement f=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		f.sendKeys("pravin");
//		WebElement u=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
//		u.click();
		WebElement q=driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 _6luy \")]"));
		q.sendKeys("kakdcadc");
		
		
		
	}
	
	

}
