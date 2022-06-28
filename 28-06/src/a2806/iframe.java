package a2806;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe {
	public static void main(String[] args) {
		WebDriver driver=demo.open("http://demo.automationtesting.in/Frames.html");
		
		WebElement a=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		
		driver.switchTo().frame(a);
		
		WebElement s=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		s.sendKeys("pravin");
		
		driver.switchTo().parentFrame();
		
		WebElement p=driver.findElement(By.xpath("//a[text()=\"Practice Site\"]"));
		p.click();
	}

}
