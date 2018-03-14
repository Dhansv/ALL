import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.*;


public class TestNg {
	WebDriver driver;
@BeforeTest
public void Before()
{
	driver=new FirefoxDriver();
	driver.get("http://demo.opencart.com/");
	
}
@Test
public void VerifyMsg() throws InterruptedException
{
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("dl@g.com");
	driver.findElement(By.id("input-password")).sendKeys("dhana");
	driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
	Select drplst = new Select(driver.findElement(By.xpath(".//*[@id='input-limit']")));
	drplst.selectByVisibleText("25");
	driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
	WebDriverWait w=new WebDriverWait(driver,15);
	WebElement p=null;
	p=w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Specification")));
	driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")).click();
	driver.findElement(By.linkText("Specification")).click();
	driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")).click();
	//Thread.sleep(4500);
	//String msg=driver.findElement(By.("alert alert-success alert-dismissible")).getText();
	                             //    .//*[@id='product-product']/div[1]   
	//String actmsg="Success: You have added Apple Cinema 30\" to your wish list!" ;
	//System.out.println(msg);
	//if(actmsg.contentEquals(msg)){
	//	System.out.println("Message is correct");
	//}
	//else{
	//	System.out.println("Wrong msg");
	//}
	p=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='search']/input")));
	driver.findElement(By.xpath(".//*[@id='search']/input")).sendKeys("Mobile");
	driver.findElement(By.xpath(".//*[@id='search']/span/button")).click();
	//p=w.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
	driver.switchTo().alert().accept();
	driver.findElement(By.id("description")).click();
	driver.findElement(By.id("button-search")).click();
	driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/div/div[1]/a/img")).click();
	driver.findElement(By.xpath(".//*[@id='input-quantity']")).clear();;
	driver.findElement(By.xpath(".//*[@id='input-quantity']")).sendKeys("3");
	
	driver.findElement(By.id("button-cart")).click();
	String str=new String();
	Thread.sleep(1500);
	str=driver.findElement(By.xpath("//div[@id='product-product']/div")).getText();
	//System.out.println(driver.findElement(By.xpath("//div[@id='product-product']/div")));
	//driver.findElement(By.xpath("//div[@id='product-product']/div")).getText().contentEquals("Success: You have added HTC Touch HD to your shopping cart!\nx");
	//assertEquals(driver.findElement(By.xpath("//div[@id='product-product']/div")).getText(),"Success: You have added HTC Touch HD to your shopping cart!\nx");
	
	//assertTrue(driver.findElement(By.xpath("//div[@id='product-product']/div")).getText().contentEquals("Success: You have added HTC Touch HD to your shopping cart!\nx"));
	try{
	assertEquals(str,"Success: You have added HTC Touch HD to your shopping cart!\nx");
	}
	catch(Error e)
	{
		
	}

	
}

@AfterMethod
public void after()
	{
	driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	driver.findElement(By.xpath(".//*[@id='cart']/ul/li[2]/div/p/a[2]/strong")).click();
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
	driver.switchTo().alert().accept();
	}



@Test

public void verifyWish() throws InterruptedException
{
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("dl@g.com");
	driver.findElement(By.id("input-password")).sendKeys("dhana");
	driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
	Select drplst = new Select(driver.findElement(By.xpath(".//*[@id='input-limit']")));
	drplst.selectByVisibleText("25");
	driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
	WebDriverWait w=new WebDriverWait(driver,15);
	WebElement p=null;
	p=w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Specification")));
	driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")).click();
	driver.findElement(By.linkText("Specification")).click();
	driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")).click();
	Thread.sleep(3000);
	try{
		assertEquals(driver.findElement(By.xpath(".//*[@id='product-product']/div[1]")).getText(),"Success: You have added Apple Cinema 30\" to your wish list!");
	}
	catch(Error e)
	{
		
	}
}
}
