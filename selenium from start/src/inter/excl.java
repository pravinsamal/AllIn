package inter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class excl {
//	public String  getdata(int a,int b) throws EncryptedDocumentException, IOException {
//		FileInputStream file=new  FileInputStream("\"D:\\Software testing\\classfiles\\data.xlsx\"");
//	
//	String value=WorkbookFactory.create(file).getSheet("data").getRow(a).getCell(b).getStringCellValue();
//	return value;
//	}
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	String us=	parametrization.getdata(0, 1);
	String pass=	parametrization.getdata(1, 1);
	String pinNum=	parametrization.getdata(2, 1);

		
		WebDriver driver=openbrowser1.open("https://kite.zerodha.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		username.sendKeys(us);
		
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		
		Thread.sleep(1500);
		WebElement pin=driver.findElement(By.xpath("//input[@id=\"pin\"]"));
		pin.sendKeys(pinNum);
		
		WebElement submit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		
		
		
	}

}
