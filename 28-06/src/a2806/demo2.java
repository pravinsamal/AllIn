package a2806;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	
		WebDriver driver=	demo.open("https://kite.zerodha.com/");
		
	String us=	excel.xl();
		
		WebElement user=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		user.sendKeys(us);
	
	
	
	}

}
