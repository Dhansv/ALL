package com.lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab1 
{
	private static String telephone;
	private static String lastname;
	private static String firstname;
	private static Object password;

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "https://demo.opencart.com/";
		String expectedTitle = "Your Store";
		String actualTitle = "";

		// launch Firefox and direct it to the Base URL
		driver.get(baseUrl);
		// get the actual value of the title
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle))
			{
				System.out.println("Test Passed!");
			} 
		else
			{
				System.out.println("Test Failed");
			}      
		
		driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		
		String Title;
		Title=driver.getTitle();
		System.out.println("The page title is :" + Title);
		
		Boolean b =  driver.getPageSource().contains("Register Account");
		if(b==true)
		{
			System.out.println("U got the right title");
		}
		else
		{
			System.out.println("Sorry .... Wrong title");
		}

		
		
		driver.findElement(By.name("firstname")).sendKeys("dhana");
		
		try{
		    firstname = null;
			if (firstname.length() < 33) {
		        // do stuff with your input 
		    } else {
		        throw new Exception("'" + firstname + "' is longer than 33 Characters");
		    }
		} catch(StringTooLongException e){
		    System.out.println ("Exceeds string length");
		}
		
		
		
		driver.findElement(By.id("input-lastname")).sendKeys("LAKSHMI");
		
		try{
		    lastname = null;
			if (lastname.length() < 33) {
		        // do stuff with your input 
		    } else {
		        throw new Exception("'" + lastname + "' is longer than 33 Characters");
		    }
		} catch(StringTooLongException e){
		    System.out.println ("Exceeds string length");
		}
		
		
		
		driver.findElement(By.id("input-email")).sendKeys("dl@g.com");
		
		 try
	        {
	          WebElement a1 = driver.findElement(By.xpath("//*[@id='Email']"));
	          System.out.println("---------Emaild exists --------------\n-----------------------");
	          a1.sendKeys("ENTER CORRECT MAIL ID");
	         }
	    catch(Throwable e)
	         {
	         System.out.println("Emaild not found: " + e.getMessage());
	         }
		
		 
		
		 
		driver.findElement(By.name("telephone")).sendKeys("9857641230");
		
		try{
		    telephone = null;
			if (telephone.length() >3 && telephone.length() <32) {
		        // do stuff with your input 
		    } else {
		        throw new Exception("'" + telephone + "Telephone No. should be between 3 to 32 characters ");
		    }
		} catch(StringTooLongException e){
		    System.out.println ("Exceeds length");
		}
		
		
		
		driver.findElement(By.cssSelector("#input-password")).sendKeys("dhana");
		
		
		try{
		    password = null;
			if ( ((String) password).length() >4 && ((String) password).length() <20) {
		        // do stuff with your input 
		    } else {
		        throw new Exception("'" + password + "' should be between 4 and 20 Characters");
		    }
		} catch(StringTooLongException e){
		    System.out.println ("Exceeds string length");
		}
		
		

		driver.findElement(By.xpath(".//*[@id='input-confirm']")).sendKeys("dhana");
		
		
		driver.findElement(By.name("newsletter")).click();	
		
		driver.findElement(By.cssSelector(".pull-right>input")).click();
		
		driver.findElement(By.xpath(".//*[@id='content']/form/div/div/input[2]")).click();
		
		
		
		
	}
}
