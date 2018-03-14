package seleniumM4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static WebDriver driver;
	static String baseUrl;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    
		    driver = new FirefoxDriver();
		    baseUrl = "https://demo.opencart.com/";
		    driver.get(baseUrl);
		    
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    String baseUrl = "http://demo.opencart.com/";
	        String expectedTitle = "Your Store";
	        String actualTitle = "";

	        // launch Firefox and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        if (actualTitle.contentEquals(expectedTitle))
	        {
	             System.out.println("Title Verified");
	         } 
	         else
	        {
	             System.out.println("Invalid Title");
	         } 
	     
	       // java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	        Thread.sleep(3000);
	        
	       
	        driver.findElement(By.cssSelector("i.fa.fa-user")).click();
	        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li/a")).click();
	       
	       
	   		driver.findElement(By.id("input-firstname")).sendKeys("");
	   		driver.findElement(By.name("lastname")).sendKeys("");
	   		
	   		driver.findElement(By.cssSelector("#input-email")).sendKeys("ertsd@gmail.com");
	   		driver.findElement(By.xpath("//fieldset[@id='account']/div[5]/div/input")).sendKeys("04288266625");
	   		
	   		driver.findElement(By.name("password")).sendKeys("9999");
	   		driver.findElement(By.id("input-confirm")).sendKeys("9999");
	   		
	   		driver.findElement(By.cssSelector("input[name='agree']")).click();
	   		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	   		
	   	 if(driver.findElement(By.cssSelector("div.text-danger")).getText().contentEquals("First Name must be between 1 and 32 characters!"))
			{
			   System.out.println("First Name must be between 1 and 32 characters!");
			 }
			else
			{
			System.out.println("First Name Validation Failed");
			}
	   	 
		 if(driver.findElement(By.xpath("//fieldset[@id='account']/div[3]/div/div")).getText().contentEquals("Last Name must be between 1 and 32 characters!"))
			{
			   System.out.println("Last Name must be between 1 and 32 characters!");
			 }
			else
			{
			System.out.println("Last Name Validation Failed");
			}
	   	 
	   	  driver.findElement(By.id("input-firstname")).clear();
	   	driver.findElement(By.id("input-firstname")).sendKeys("Dhanalakshmi");
		  driver.findElement(By.id("input-lastname")).clear();
	   	driver.findElement(By.name("lastname")).sendKeys("valliappan");
	   	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	   	
	   /* if(driver.findElement(By.cssSelector("input-email")).getText().contentEquals("First Name must be between 1 and 32 characters!"))
		{
		   System.out.println("First Name must be between 1 and 32 characters!");
		 }
		else
		{
		System.out.println("FirstName Validation Failed");
		}
	 
	 	if(driver.findElement(By.xpath(".//*[@id='input-telephone']")).getText().contentEquals("Telephone must be between 3 and 32 characters!"))
		{
			System.out.println(" Telephone must be between 1 and 32 characters! ");
		 }
		else
		{
			System.out.println("Telephone Number Validation Failed");
		}*/

	    if(driver.findElement(By.xpath("//div[@id='content']/form/fieldset[2]/div[2]/div/div")).getText().contentEquals("Password confirmation does not match password!"))
	    {

	   		System.out.println("Password confirmation does not match password!.");
	   	 }
	   	else
	   	{
	   		System.out.println("Password Validation Failed");
	   	}
	   	
	   	if(driver.findElement(By.xpath(".//input[@name='newsletter']")).getText().contentEquals("Yes/No"))
		{
			System.out.println("Subscribe radio button present");
		 }
		else
		{
			System.out.println("Radio button Validation Failed");
		}
	   	
	   	driver.findElement(By.xpath(".//input[@name='newsletter'])[2]")).click();
	   	driver.findElement(By.cssSelector("input[name='agree']")).click();
	   	driver.findElement(By.linkText("Continue")).click();
	    Thread.sleep(5000);

	    if(driver.findElement(By.xpath(".//div[@id='content']/h1")).getText().contentEquals("Your Account Has Been Created!"))
		{
		   System.out.println("Your Account Has Been Created!");
		 }
		else
		{
		System.out.println("Account creation Validation Failed");
		}
	    
	    driver.findElement(By.linkText("Phones & PDAs")).click();
	    driver.findElement(By.linkText("HTC Touch HD")).click();
	    
	    if(driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div/div[2]/div/h4/a")).getText().contentEquals("HTC Touch HD"))
		{
		   System.out.println("HTC Present");
		 }
		else
		{
		System.out.println("Verification Failed");
		}
	    
	    driver.findElement(By.cssSelector("div.button-group > button[type='button']")).click();
	    
	    if(driver.findElement(By.xpath("//div[@id='product-category']/div")).getText().contentEquals("Success: You have added HTC Touch HD to your shopping cart!"))
		{
		   System.out.println("Product Added Validation Verified");
		 }
		else
		{
		System.out.println("Product Added Validation Failed");
		}
	    
	    driver.findElement(By.linkText("Brands")).click();
	    if(driver.findElement(By.cssSelector("#content > h1")).getText().contentEquals("Find Your Favorite Brand"))
		{
		   System.out.println("Find Your Brand Heading Verified");
		 }
		else
		{
		System.out.println("Find Your Brand verification Failed");
		}
	  
	    driver.findElement(By.linkText("Canon")).click();
	    
	    if(driver.findElement(By.cssSelector("//div[@id='content']/div[2]/div/a")).getText().contentEquals("Canon"))
		{
		   System.out.println(" Brand Heading Verified");
		 }
		else
		{
		System.out.println(" Brand heading verification Failed");
		}
	    
	    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div/div[2]/div[2]/button[2]")).click();

	    if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("Success: You have added Canon EOS 5D to your wish list! "))
		{
		   System.out.println(" Add to cart Verified");
		 }
		else
		{
		System.out.println("Add to cart verification Failed");
		}
	    
	    driver.findElement(By.linkText("Wish List")).click();
	    
	    if(driver.findElement(By.xpath("//div[@id='content']/h2")).getText().contentEquals("My Wish List "))
		{
		   System.out.println("My Wish List Verified");
		 }
		else
		{
		System.out.println("My Wish List verification Failed");
		}
	   
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Continue")).click();
	    driver.close();
	    
	}

}
