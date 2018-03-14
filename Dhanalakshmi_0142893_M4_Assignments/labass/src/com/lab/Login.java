package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		new WebDriverWait(driver, 10);
		
		String baseUrl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseUrl);
		
		driver.findElement(By.id("input-email")).sendKeys("dhan@g.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("dhana");
		driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/form/input")).click();
		
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		Select drplst = new Select(driver.findElement(By.xpath(".//*[@id='input-limit']")));
		drplst.selectByVisibleText("25");
		
		driver.findElement(By.xpath(".//*[@id='input-limit']/option[2]")).click();
		driver.findElement(By.cssSelector(".button-group>button")).click();
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Specification")));
		driver.findElement(By.linkText("Specification")).click();
		
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")).click();
		
		//String msg=driver.findElement(By.className("alert alert-success alert-dismissible")).getText();
		//String actmsg="Success: You have added Apple Cinema 30\" to your wish list!" ;
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='search']/input")));
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
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.xpath(".//*[@id='cart']/ul/li[2]/div/p/a[2]/strong")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
		driver.switchTo().alert().accept();
		
	}
}
