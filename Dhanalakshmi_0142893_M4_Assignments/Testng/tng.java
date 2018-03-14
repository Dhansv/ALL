package selenium;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class tng {
	WebDriver driver = new FirefoxDriver();
	@BeforeMethod public void before()
	{
		String baseurl="http://demo.opencart.com";
		driver.get(baseurl);
	}
	
	@Test
	public void test(){
		
		WebDriverWait wait= new WebDriverWait(driver,5);
		String expectedTitle = "Your Store";
        assertEquals(driver.getTitle(),"Your Store");

     }
	
		  
	
	
	@Test
	public void test2()
	{
		driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();

	    WebElement element = driver.findElement(By.xpath(".//*[@id='content']/h1"));
        assertEquals(element.getText(),"Register Account");
	}
     
	
	@Test
	public void test3()
	{
		// driver.findElement(By.id("input-firstname")).sendKeys("DHANUSRR");
         //      driver.findElement(By.name("lastname")).sendKeys("LAKSHMI");
	     //  driver.findElement(By.name("email")).sendKeys("dl@g.com");
	     //  driver.findElement(By.id("input-telephone")).sendKeys("9632587410");
	    // driver.findElement(By.id("input-password")).sendKeys("dhana");
	     // driver.findElement(By.name("confirm")).sendKeys("dhana");
	       //driver.findElement(By.name("agree")).click();
	        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	        driver.switchTo().alert().accept();
	        assertEquals(driver.findElement(By.xpath(".//*[@id='account-register']/div[1]")).getText(),"Warning: You must agree to the Privacy Policy!");
	}

	
	}


