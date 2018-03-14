package sel3;
//import java.io.File;
//import java.util.*;

//import junit.framework.Assert;

//import org.openqa.selenium.Alert;
import java.sql.Time;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Selenium3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String baseurl="http://demo.opencart.com";
		driver.get(baseurl);
		WebDriverWait wait= new WebDriverWait(driver,5);
		String expectedTitle = "Your Store";
        String actualTitle = "";
        actualTitle=driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle))
        {
             System.out.println("Title varified!");
         } 
         else
        {
             System.out.println("Please! Enter correct Title");
         }      

        driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
        WebElement element = driver.findElement(By.xpath(".//*[@id='content']/h1"));
        String strng = element.getText();
        System.out.println(strng);
        String a="Register Account";
        if (strng.contentEquals(a))
        {
             System.out.println("Matched!");
        } 
       
      //   System.out.println("Matched");
        
        driver.findElement(By.id("input-firstname")).sendKeys("DHANA");

         
        
        
       driver.findElement(By.name("lastname")).sendKeys("LAKSHMI");
       driver.findElement(By.name("email")).sendKeys("dl@g.com");
       driver.findElement(By.id("input-telephone")).sendKeys("9632587410");
     driver.findElement(By.id("input-password")).sendKeys("dhana");
      driver.findElement(By.name("confirm")).sendKeys("dhana");
       driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//     driver.switchTo().alert().accept();
     
    try{
    String f=driver.findElement(By.xpath(".//*[@id='account-register']/div[1]")).getText();
  
    System.out.println(f);
    }
    catch(Exception e)
    {
    	
    	System.out.println("You have accepted terms & conditions");
    }
     try{
      String fname=driver.findElement(By.className("text-danger")).getText();
      String msg="First Name must be between 1 and 32 characters!";
      if (fname.contentEquals(msg))
      {
           System.out.println("Wrong credential!");
      } 
     
     // System.out.println(fname);
      }
    
      catch(Exception e)
      {
    	  System.out.println("your first name is right");
      }
      try{
      String lname=driver.findElement(By.xpath("//fieldset[@id='account']/div[3]/div/div")).getText();
      System.out.println(lname);
      }     
      catch(Exception e)
      {
    	  System.out.println("required last name");
      }
      
      try
      {
      String eml=driver.findElement(By.xpath("//fieldset[@id='account']/div[4]/div/div")).getText();
      System.out.println(eml);
      }
      catch(Exception e)
      {
    	  System.out.println("required email");
      }
      
      try{
      String mob=driver.findElement(By.xpath("//fieldset[@id='account']/div[5]/div/div")).getText();
      System.out.println(mob);   
      }
      catch(Exception e)
      {
    	  System.out.println("required mobile no");
      }
      //driver.findElement(By.cssSelector("i.fa.fa-user")).click();
    driver.findElement(By.linkText("Address Book")).click();
    driver.findElement(By.linkText("New Address")).click();
    driver.findElement(By.id("input-firstname")).sendKeys("dhana");
    driver.findElement(By.name("lastname")).sendKeys("lakshmi");
    driver.findElement(By.id("input-address-1")).sendKeys("Chowk");
    
    driver.findElement(By.name("city")).sendKeys("pune");
    driver.findElement(By.name("postcode")).sendKeys("392015");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("input-country")));
	Select country = new Select(driver.findElement(By.id("input-country")));
	
	country.selectByValue("56");
	// Thread.sleep(10);
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("input-zone")));
	Select zone = new Select(driver.findElement(By.id("input-zone")));
	///river.findElement(By.id("input-zone")).click();
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("input-zone")));
     
    //	driver.findElement(By.id("input-zone/option[1485]")).click();
	zone.selectByVisibleText("Pune");
    
    
    //  driver.findElement(By.id("input-email")).sendKeys("dl@g.com");
    //  driver.findElement(By.id("input-password")).sendKeys("dhana");
    //  driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/form/input[1]")).click();
    //  driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
      
	}
	}      
	    

                
           // 
     // try{
    	 // Boolean g=driver.getPageSource().contains("Warning:"); 
    	//  System.out.println(g);
    	  
    //	  
    //	 WebElement n= driver.findElement(By.className("text-danger"));
   	//	System.out.println("Alert text is:" + n);
      


        	      
        
     
        
      //   WebElement ele = driver.findElement(By.xpath("//div[@id='account-register']/div"));
      //   String warn = ele.getText();
    //  System.out.println(warn);
       //  Assert.assertEquals("Warning: You must agree to the Privacy Policy!", warn);
	     //  String bodyText = driver.findElement(By.tagName("Warning: You must agree to the Privacy Policy!")).getText();
        // Assert.assertTrue("Warning: You must agree to the Privacy Policy!", bodyText.contains(text));
         
	



