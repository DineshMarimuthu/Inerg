package inerg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POMinerg {

	  WebDriver driver;
	public POMinerg(WebDriver driver)
	{
		this.driver=driver;
	}
	By States= By.xpath("//select");
	
	public void selectItems(String t ) {
		WebElement tr=driver.findElement(States);
		Select sr= new Select(tr);
		sr.selectByVisibleText(t);
		
		
	}

}
