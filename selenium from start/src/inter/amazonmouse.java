package inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class amazonmouse {
	public static void main(String[] args) {
		
		
		WebDriver driver=openbrowser1.open("https://www.amazon.in/");
		
		WebElement move1=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(move1);
		act.perform();
		
		WebElement showroom=driver.findElement(By.xpath("//span[text()=\"Explore Showroom\"]"));
		showroom.click();
		
		
		
		
		
		}

}
