package PLPproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class DataDriven {

	
	WebDriver driver;
	@Test (dataProvider="LoginData")
	public void LoginToShoppingApp(String username, String password)throws InterruptedException
	
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///D:/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lab%20Files/Lab%20Files/LoginPage.html");
		//@FindBy(name = "userid") 
		//WebElement username;
		//@FindBy(name = "pswrd")
		//WebElement password;
		//@FindBy(xpath = "/html/body/form/input[3]") 
		
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}
	
	@DataProvider(name="LoginData")
	public Object[][]datapass()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="Dayanand";
		data[0][1]="Capgemini";
		data[1][0]="SeleniumUser";
		data[1][1]="selenium123";
		data[2][0]="Ayush";
		data[2][1]="Capgemini";
		
		return data;
	}
	
}


