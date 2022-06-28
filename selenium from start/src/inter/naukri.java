package inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class naukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=openbrowser1.open("https://www.naukri.com/");
		
		WebElement  login=driver.findElement(By.xpath("//div[text()=\"Login\"]"));
		login.click();
		
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		username.sendKeys("samalp911@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("Handball1212@");
		
		WebElement submit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		
		WebElement edit=driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[7]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		act.moveToElement(edit);
		act.perform();
	}

}
