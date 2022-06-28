package inter;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
	WebDriver driver=	openbrowser1.open("https://tirupatibalaji.ap.gov.in/#/login");
	
		File sourc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File destination=new File("E:\\ALL jar\\ScreenShot\\ttd.png");
		 
		 FileHandler.copy(sourc, destination);
	}

}
