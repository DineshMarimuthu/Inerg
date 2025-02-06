package inerg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class States {
	 WebDriver driver= new ChromeDriver();
@BeforeMethod()
	 void launch() {
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://inerg-test.web.app/");
	}
@Test
	public  void mre() throws InterruptedException {
		// TODO Auto-generated method stub
		
	 POMinerg py = new POMinerg(driver);
	    py.selectItems("Kerala");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 700)");

	    List<WebElement> t = driver.findElements(By.xpath("//*[local-name()='svg']//*[@class='points']"));

	    int tre = t.size();

	    for (int i = 0; i < tre; i++) {
	        Actions action = new Actions(driver);
	        action.moveToElement(t.get(i)).perform();
	        System.out.println("start");
	        String te = t.get(i).getText();
	        System.out.println(te);
	    }
		}
	//}
@AfterMethod()
	void closure() {
		driver.quit();	
	}

}
