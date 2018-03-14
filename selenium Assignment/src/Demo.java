import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		String baseUrl = "http://demo.opencart.com/";
        String expectedTitle = "Your Store";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle))
        {
             System.out.println("Test Passed!");
        } 
         else
        {
             System.out.println("Test Failed");
        }      
        
        Select drpAccount = new Select(driver.findElement(By.id("My Account")));
        //drpCity.selectByVisibleText("Select");
    			
    	drpAccount.selectByVisibleText("Register");
    	drpAccount.selectByIndex(1);
    	
    	//Click on 'Continue' button at the bottom of the page
    	selenium.click("myButton");
	}

}
