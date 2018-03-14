package Pagefactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
 
import org.openqa.selenium.support.PageFactory;
public class Register {
	static WebDriver driver;
	 
	 @FindBy(how = How.XPATH, using = ".//*[@id='top-links']/ul/li[2]/a/span[2]")
	 static WebElement MyAccount;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Register")
	 static WebElement Register;
	 
	 @FindBy(how = How.ID, using = "input-firstname")
	 static WebElement FirstName;
	 
	 @FindBy(how = How.ID, using = "input-lastname")
	 static WebElement LastName;
	 @FindBy(how = How.ID, using = "input-email")
	 static WebElement Email;
	 @FindBy(how = How.ID, using = "input-telephone")
	 static WebElement Telephone;
	 @FindBy(how = How.ID, using = "input-password")
	 static WebElement Password;
	 @FindBy(how = How.ID, using = "input-confirm")
	 static WebElement ConfirmPassword;
	 @FindBy(how = How.XPATH, using = ".//*[@id='content']/form/fieldset[3]/div/div/label[2]/input")
	 static WebElement Newsletter;
	 @FindBy(how = How.NAME, using = "agree")
	 static WebElement Subscribe;
	 @FindBy(how = How.XPATH, using = " .//*[@id='content']/form/div/div/input[2]")
	 static WebElement Continue;
	 
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			driver = new FirefoxDriver();
			 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://demo.opencart.com/");
	 
	        PageFactory.initElements(driver, Register.class);
	 
	        MyAccount.click();
	        Register.click();
        FirstName.sendKeys("lakshmibhavani");
        LastName.sendKeys("Datla");
        Email.sendKeys("amaa1@gmail.com");
        Telephone.sendKeys("9100781680");
        Password.sendKeys("amaa@123");
       ConfirmPassword.sendKeys("amaa@123");
       Newsletter.click();
       Subscribe.click();
       Continue.click();

	}

}
