//import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class LocatingElement {
	public static void main(String[] args){
	// TODO Auto-generated method stub
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("file:///D:/Dhanalakshmivalliappan/Module2_3_4 Material/Old Firefox/Selenium/Selenium Installations/Selenium Demos & Lab files/Lesson 2 - Demos/Lesson 2 - Demos/HTML Pages/LocatingElements.html/");
	
	//Find Firstnametextbox and enter value
     driver.findElement(By.id("FN")).sendKeys("Dhana");
			
    //Find Middlenametextbox and enter value
	driver.findElement(By.name("mname")).sendKeys("lakshmi");
			
	//Find Lastnametextbox and enter value
	driver.findElement(By.id("LN")).sendKeys("Valliappan");
			
	//Find dobtextbox and enter value
	driver.findElement(By.name("dob")).sendKeys("16/06/1995");
					
	//Find contact textbox and enter value
	driver.findElement(By.name("contact_no")).sendKeys("9876543210");
			
	//Find Email textbox and enter value
	driver.findElement(By.id("EmailID")).sendKeys("dhanalakshmi.valliappan@capgemini.com");
			
	//Findpassporttextbox and enter value
	driver.findElement(By.id("PNO")).sendKeys("56001859");
			
	Select drpCountry = new Select(driver.findElement(By.id("country")));
    //drpCity.selectByVisibleText("Select");
			
	drpCountry.selectByVisibleText("Select Country");
	drpCountry.selectByIndex(1);
	drpCountry.selectByIndex(2);
	
	
	Select drpCity = new Select(driver.findElement(By.id("city_input")));
    //drpCity.selectByVisibleText("Select");
			
	drpCity.selectByVisibleText("Select City");
	drpCity.selectByIndex(1);
	drpCity.selectByIndex(2);
	
	

	//Find Gender radio button and enter value
			driver.findElement(By.cssSelector("input[value='female']")).click();

			//Find total experience and enter value
			driver.findElement(By.name("total_exp")).sendKeys("0");
			
			//Find relevant experience and enter value
			driver.findElement(By.name("relv_exp")).sendKeys("9");
			
	//Find PresentEmployertextbox and enter value
			driver.findElement(By.name("present_emp")).sendKeys("Yes");
			
   Select drpRelationshipwiththecandidate = new Select(driver.findElement(By.name("relation")));
			
			
			drpRelationshipwiththecandidate.selectByVisibleText("Friend");
			drpRelationshipwiththecandidate.selectByIndex(1);
			drpRelationshipwiththecandidate.selectByIndex(2);
			
			//Find Resume textbox and enter value
			driver.findElement(By.name("resume")).sendKeys("dfghfjgdjksrj");
	
	
	/*List<WebElement> element = driver.findElements(By.name("chkHobbies"));
	
	for (WebElement webElement : element)
	{
		webElement.click();
		
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex.getMessage());
		}			
	} */
	
    		//Examples of Get commands
	
			String Title;
			Title=driver.getTitle();
			System.out.println("The page title is :" + Title);
			
			Boolean b =  driver.getPageSource().contains("Employee Details");
			
			if(b==true)
			{
				System.out.println("U got the right title");
			}
			else
			{
				System.out.println("Sorry .... Wrong title");
			}

			String currentURL;
			currentURL = driver.getCurrentUrl();
			System.out.println("The page current URL is :" + currentURL);
					
			//Find Submit button
			//driver.findElement(By.name("submit")).click();
			//driver.close();
			//driver.quit();
	}
	
}
