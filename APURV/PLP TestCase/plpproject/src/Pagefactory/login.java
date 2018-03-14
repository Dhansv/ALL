package Pagefactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
 
import org.openqa.selenium.support.PageFactory;
 

public class login {
	static WebDriver driver;
	 //My account
	 @FindBy(how = How.XPATH, using = ".//*[@id='top-links']/ul/li[2]/a/span[2]")
	 static WebElement MyAccount;
	 //login
	 @FindBy(how = How.XPATH, using = ".//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
	 static WebElement login;
	 //email
	 @FindBy(how = How.ID, using = "input-email")
	 static WebElement Emailaddress;
     //password
	 @FindBy(how = How.ID, using = "input-password")
	 static WebElement txtbx_Password;
     //login
	 @FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div[2]/div/form/input")
	 static WebElement btn_Login ;
	 //logout
	 @FindBy(how = How.XPATH, using = ".//*[@id='top-links']/ul/li[2]/ul/li[5]/a")
	 static WebElement logout ;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("https://demo.opencart.com/");
 
        PageFactory.initElements(driver, login.class);
        //click on myaccount
        MyAccount.click();
        //click on login
        login.click();
        //enter emailaddress
        Emailaddress.sendKeys("lakshmibhavanidatla@gmail.com");
        //Enter password
        txtbx_Password.sendKeys("Bhanu@1996");
       //click on login
        btn_Login.click();
 
        System.out.println(" Login Successfully");
        //click on my account
        MyAccount.click();
        //click on logout
        logout.click();
        //close
        driver.quit();

	}

}
