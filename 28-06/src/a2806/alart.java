package a2806;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alart {
	public static void main(String[] args) {
	WebDriver driver=	demo.open("https://nxtgenaiacademy.com/alertandpopup/");
	
	WebElement c=driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
	c.click();
	
Alert a=	driver.switchTo().alert();
a.accept();
	
	
	}

}
