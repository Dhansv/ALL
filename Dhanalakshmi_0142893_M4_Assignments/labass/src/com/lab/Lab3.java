import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
public class Lab3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.opencart.com/");
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("dl@g.com");
	driver.findElement(By.id("input-password")).sendKeys("dhana);
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
	//Thread.sleep(4000);
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
	driver.findElement(By.xpath(".//*[@id='input-quantity']")).sendKeys("2");
	String strq="Success: You have added HTC Touch HD to your shopping cart!\nx";
	driver.findElement(By.id("button-cart")).click();
 Object str=new String();
	
	Thread.sleep(1000);
	str=driver.findElement(By.xpath("//div[@id='product-product']/div")).getText();
	//boolean a=driver.findElement(By.xpath("//div[@id='product-product']/div")).getText().equals(strq);
	System.out.println(str);
	

	
	
	if(driver.findElement(By.xpath("//div[@id='product-product']/div")).getText().equals("Success: You have added HTC Touch HD to your shop cart!\nx"));
	{
	System.out.println("Verified");}
	//System.out.println("Success: You have added HTC Touch HD to your shopping cart!\nx");
	driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	
	driver.findElement(By.xpath(".//*[@id='cart']/ul/li[2]/div/p/a[2]/strong")).click();
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/i")).click();
	driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
	//driver.switchTo().alert().accept();
	
	

	}
}
