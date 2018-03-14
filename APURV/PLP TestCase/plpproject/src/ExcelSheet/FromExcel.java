package ExcelSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class FromExcel {

	    
		WebDriver driver;
	    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    guru99Workbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {
	        	
	        
	        	//Sending Data to HTML Form
	        	driver=new FirefoxDriver();
	    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    		driver.get("https://demo.opencart.com/index.php?route=account/login");
	    		driver.findElement(By.id("input-email")).sendKeys(username);
	    		driver.findElement(By.id("input-password")).sendKeys(password);
	    		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/form/input")).click();;
	    		Thread.sleep(5000);
	    		System.out.println(driver.getTitle());
	    		driver.close();
	        	

	            //Print Excel data in console
	            System.out.print(row.getCell(j).getStringCellValue()+"||");
	            
	        }

	        System.out.println();

	    }

	    

	    }

	    

	    //Main function is calling readExcel function to read data from excel file

	    public static void main(String...strings) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    	DataExcel objExcelFile = new DataExcel();

	    	
	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"//src//com//cg//pagefactory";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"Book1.xlsx","Sheet1");

	    }

	}
	


