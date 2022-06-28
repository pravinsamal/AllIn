package inter;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectType {
	public static void main(String[] args) {
	WebDriver driver=	openbrowser1.open("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	WebElement s=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		
	Select a=new Select(s);
//	 b
	a.selectByVisibleText("Baby Cat");

	}

}
